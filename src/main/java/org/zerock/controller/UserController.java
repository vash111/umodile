
package org.zerock.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.NoticeVO;
import org.zerock.domain.OrderVO;
import org.zerock.domain.ReviewVO;
import org.zerock.domain.UserVO;
import org.zerock.service.NoticeService;
import org.zerock.service.OrderService;
import org.zerock.service.ReviewService;
import org.zerock.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/user/*")
@RequiredArgsConstructor
public class UserController {

	private final UserService service;
	
	private final NoticeService noticeService;
	
	private final ReviewService reviewService;
	
	private final UserService userService;
	
	private final OrderService orderService;
	
	
	PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	
	@GetMapping("/checkdetails")
	public void checkDetails(HttpServletRequest request, HttpSession session, Model model) {

		UserVO user = (UserVO) request.getSession().getAttribute("user");
		Long uno = user.getUno();

		List<OrderVO> orderList = orderService.orderRead(uno);
		model.addAttribute("orderList" , orderList);
	}
	
	// 유저 공지 리스트
	@GetMapping("/notice")
	public String userNotice(
	        @RequestParam(defaultValue = "1") int page, // 기본값 1페이지
	        Model model) {
	    int limit = 10; // 한 페이지에 보여줄 게시물 수
	    int offset = (page - 1) * limit; // 시작점 계산

	    // 공지사항 목록 가져오기
	    List<NoticeVO> noticeList = noticeService.getAllWithPaging(offset, limit);
	    // 전체 공지사항 개수 가져오기
	    int totalResults = noticeService.countAllPosts();
	    // 전체 페이지 계산
	    int totalPages = (int) Math.ceil((double) totalResults / limit);

	    // 모델에 데이터 추가
	    model.addAttribute("noticeList", noticeList); // 공지사항 목록
	    model.addAttribute("currentPage", page); // 현재 페이지
	    model.addAttribute("totalPages", totalPages); // 전체 페이지 수

	    return "user/notice";
	}
	
	// 유저 공지사항 검색 + 페이징 처리
	@GetMapping("/notice/search")
	public String search(@RequestParam("keyword") String keyword,
	                     @RequestParam(defaultValue = "1") int page,
	                     Model model) {
	    int limit = 10; // 한 페이지에 표시할 공지사항 수
	    int offset = (page - 1) * limit; // 시작 데이터

	    // 검색된 공지사항 목록 가져오기
	    List<NoticeVO> searchResults = noticeService.searchPosts(keyword, offset, limit);

	    // 총 검색 결과 개수 가져오기
	    int totalResults = noticeService.countSearchPosts(keyword);
	    int totalPages = (int) Math.ceil((double) totalResults / limit); // 총 페이지 수 계산

	    model.addAttribute("noticeList", searchResults); // 검색 결과
	    model.addAttribute("currentPage", page); // 현재 페이지
	    model.addAttribute("totalPages", totalPages); // 전체 페이지 수
	    model.addAttribute("keyword", keyword); // 검색어 유지

	    return "user/notice";
	}

	// 유저 공지사항 상세 보기 (숫자 ID만 허용)
	@GetMapping("/notice/{nno:\\d+}")
	public String readNotice(@PathVariable Long nno, Model model) {
	    NoticeVO notice = noticeService.read(nno);
	    model.addAttribute("notice", notice);
	    return "user/read";
	}
	
	///////////////////////////////////////////////////////////////////////

	// 회원가입 진입
	@GetMapping("/join")
	public String userJoin(Model model) {

		return "user/join";
	}

	// ID 중복체크
	@PostMapping("/user/checkEmail")
	@ResponseBody // view에 요청응답하려면 필수로넣읍시다..
	public String checkEmail(@RequestParam("email") String email) {

		boolean isEmailExist = service.checkEmail(email);

		return isEmailExist ? "exists" : "not exists";
	}

	// 회원가입 요청처리
	@PostMapping("/doJoin")
	public String userJoin(UserVO vo, BindingResult result, Model model) {

		String rawPw = "";
		String encodePw = "";

		// 비밀번호 확인이 일치하지 않으면 에러 처리
		if (!vo.getPassword().equals(vo.getPasswordConfirm())) {
			result.rejectValue("passwordConfirm", "error.passwordConfirm", "비밀번호 확인이 일치하지 않습니다.");
		}

		// 유효성 검사 실패 시 다시 회원가입 페이지로 리다이렉트
		if (result.hasErrors()) {
			return "user/join"; // 에러 발생 시 이동할 페이지
		}

		rawPw = vo.getPassword();
		encodePw = passwordEncoder.encode(rawPw);
		vo.setPassword(encodePw);

		service.register(vo);

		return "redirect:/";
	}

	// 로그인 진입
	@GetMapping("/login")
	public String userLogin() {
		return "/user/login";
	}

	// 로그인처리
	@PostMapping("/login")
	public String userLogin(@RequestParam String username, @RequestParam String password, Model model,
			HttpSession session) {

		UserVO user = service.login(username, password);

		if (user == null) {
			model.addAttribute("loginMessage", "아이디 또는 비밀번호를 확인해주세요.");
			return "user/login"; // 로그인 페이지로 다시 돌아가기
		} else {
			model.addAttribute("user", user); // 마이페이지에 회원정보 전달용
			session.setAttribute("user", user); // 로그인 성공 시 세션에 유저정보 저장
		}

		return "redirect:/";
	}

	// 마이페이지 진입
	@GetMapping("/Edit")
	public String myFage() {
		
		return "user/Edit";
	}

	// 회원수정 post처리
	@PostMapping("/update")
	public String updateUser(UserVO updateUser, BindingResult result, 
			HttpServletRequest request, HttpSession session) {

		String rawPw = "";
		String encodePw = "";
		
		UserVO userSession = (UserVO) request.getSession().getAttribute("user");
		updateUser.setUno(userSession.getUno());

		// 유효성 검사 실패 시 다시 회원가입 페이지로 리다이렉트
		if (result.hasErrors()) {
			return "user/Edit"; // 에러 발생 시 이동할 페이지
		}
		
		/* 비밀번호 미포함해서 수정 시 */
		if(updateUser.getPassword() == null || updateUser.getPassword() == "") {
			service.updateUser(updateUser);
		} else {
			/* 비밀번호 포함 해서 수정 시 */
			rawPw = updateUser.getPassword(); 
			encodePw = passwordEncoder.encode(rawPw); //변경한 비밀번호 암호화
			updateUser.setPassword(encodePw);
			service.updateUserPw(updateUser);
		}

		 // 세션에 수정된 user 정보를 저장
	    session.setAttribute("user", updateUser);
	    
		return "redirect:/user/Edit"; // 회원정보 수정 후 로그인 페이지로 리다이렉트
	}

	
	
	// 회원탈퇴 post처리
	@PostMapping("/delete")
	public String deleteUser(HttpServletRequest request) {

		// 세션에서 UserVO 객체를 가져오기
		UserVO user = (UserVO) request.getSession().getAttribute("user");

		Long uno = user.getUno();

		if (uno != null) {
			boolean isDeleted = service.deleteUserByEmail(uno);

			if (isDeleted) {
				request.getSession().invalidate();
				return "redirect:/"; 
			} else {
				return "error"; // 탈퇴 실패 시 오류 페이지로 이동
			}
		}

		return "redirect:/";
	}
	
	////////////////////////////////////////////////////////////////////////////
	


	
	
}