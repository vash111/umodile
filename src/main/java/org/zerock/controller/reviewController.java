package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ReviewVO;
import org.zerock.service.ReviewService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/user")
public class reviewController {

	private final ReviewService reviewService;
	
	@Autowired
	public reviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	
	@GetMapping("/review")
	public String reviewList(Model model) {
		List<ReviewVO> reviewList = reviewService.getAllWithPaging(0, 10);
		model.addAttribute("reviewList",reviewList);
		return "user/review";
	}
	
	@GetMapping("/reviews")
    public String getReviews(Model model) {
        List<ReviewVO> reviewList = reviewService.getAllWithPaging(0,10);
        
        model.addAttribute("reviewList", reviewList);
        return "reviews";
    }
}