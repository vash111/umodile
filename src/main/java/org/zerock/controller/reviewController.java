package org.zerock.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.NoticeVO;
import org.zerock.domain.ReviewVO;
import org.zerock.domain.UserVO;
import org.zerock.service.ReviewService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;
    
    
    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("review", new ReviewVO()); 
        return "review/create"; 
    }
    
    @PostMapping("/create")
    public String create(ReviewVO review) {
    	reviewService.create(review);
        return "redirect:/";
    }
    
 
}