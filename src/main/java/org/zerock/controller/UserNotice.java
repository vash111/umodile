package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.NoticeVO;
import org.zerock.service.NoticeService;


@Controller
@RequestMapping("/user")
public class UserNotice {
	
	private final NoticeService noticeService;
	
	@Autowired
	public UserNotice(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	@GetMapping("/notice")
    public String userLogin(Model model) {
		List<NoticeVO> noticeList = noticeService.getAllWithPaging(0, 10);
	    model.addAttribute("noticeAllList", noticeList); 
        return "user/notice";
    }
	
	

}
