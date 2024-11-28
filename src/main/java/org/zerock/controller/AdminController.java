package org.zerock.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.NoticeVO;
import org.zerock.service.NoticeService;


@Controller
@RequestMapping("/admin")
public class AdminController {

    private final NoticeService noticeService;

    // 생성자 주입
    @Autowired
    public AdminController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @GetMapping("/adminloginJoin")
    public String showAdminLoginPage() {
        return "admin/adminloginJoin";
    }

    @GetMapping("/adminjoin")
    public String adminJoin() {
        return "admin/adminjoin";
    }

    @GetMapping("/registerProduct")
    public String adminRegisterProduct() {
        return "admin/registerProduct";
    }

    @GetMapping("/Adminmain") //공지사항 리스트 (3개) 불러오기
    public String adminMain(Model model) {
        List<NoticeVO> noticeList = noticeService.getRecentNotices(3);
        model.addAttribute("noticeList", noticeList);
        return "admin/Adminmain"; // JSP 파일 이름
    }
    
    @GetMapping("/read/{nno}") // 공지사항 상세보기
    public String read(@PathVariable Long nno, Model model) {
    	NoticeVO notice = noticeService.read(nno);
        model.addAttribute("notice", notice);
        return "admin/read";
    }
    
    @GetMapping("/modify/{nno}") // 수정 폼
    public String updateForm(@PathVariable Long nno, Model model) {
        NoticeVO notice = noticeService.read(nno);

        // LocalDateTime -> String 변환
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = notice.getRegdate().format(formatter);

        model.addAttribute("notice", notice);
        model.addAttribute("formattedDate", formattedDate);

        return "admin/modify";
    }

    @PostMapping("/modify/{nno}") // 수정 처리
    public String update(NoticeVO notice) {
        noticeService.update(notice);
        return "redirect:/admin/Adminmain";
    }
    
    @DeleteMapping("/delete/{nno}") //삭제
    public ResponseEntity<Void> deleteNotice(@PathVariable Long nno) {
        try {
            noticeService.delete(nno);  
            return ResponseEntity.ok().build();  
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 실패 응답
        }
    }
}
