package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.NoticeVO;
import org.zerock.service.NoticeService;


@Controller
@RequestMapping("/admin")
public class AdminListController {

	private final NoticeService noticeService;
	
	@Autowired
	public AdminListController(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	@GetMapping("/notice")
	public String noticList(Model model) {
	    List<NoticeVO> noticeList = noticeService.getAllWithPaging(0, 10); // 첫 10개 공지사항 가져오기
	    model.addAttribute("noticeAllList", noticeList); // noticeAllList 이름으로 모델에 추가
	    return "admin/notice";
	}
    
    @GetMapping("/register")
    public String noticRegister() {
        return "admin/register";  
    }
    
    @GetMapping("/modify")
    public String noticModify() {
        return "admin/modify";  
    }
    
    
    @GetMapping("/read")
    public String noticRead() {
        return "admin/read";  
    }
    
    
    
	// 관리자 페이지 에서 고객이 핸드폰 신청한 내역 만 볼수 있다. 
	  @GetMapping("/PhoneApplicationdetails") 
	  public String AddphoneList() {
	  
	  
	  return "admin/PhoneApplicationdetails";
	  
	  }
	 
}
