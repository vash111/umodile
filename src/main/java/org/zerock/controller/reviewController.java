package org.zerock.controller;

<<<<<<< HEAD
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.zerock.domain.ReviewVO;
import org.zerock.service.ReviewService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class reviewController {

    private final ReviewService reviewService;

    // 리뷰 + 사용자 이름 + 휴대폰 상세 정보 가져오기
    @GetMapping("/review/details")
    public String getReviewsWithDetails(Model model) {
        // 서비스에서 리뷰 데이터 가져오기
        List<ReviewVO> reviews = reviewService.getReviewsWithDetails();

        // 모델에 데이터 추가
        model.addAttribute("reviews", reviews);

        // JSP 뷰 이름 반환
        return "review/details"; 
    }
    
	 // 리뷰 작성 요청 처리
    @PostMapping("/review/create")
    public String createReview(ReviewVO reviewVO, Model model) {
        // 리뷰 데이터 삽입
        boolean isInserted = reviewService.createReview(reviewVO);

        // 성공/실패 여부에 따라 결과 페이지 반환
        if (isInserted) {
            model.addAttribute("message", "리뷰가 성공적으로 작성되었습니다.");
            return "redirect:/reviews/success"; // 성공 페이지로 리다이렉트
        } else {
            model.addAttribute("message", "리뷰 작성에 실패했습니다.");
            return "redirect:/reviews/error"; // 실패 페이지로 리다이렉트
        }
    }
}
=======
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
>>>>>>> 2e99289055616f7091675884d76c17130fcb1f9d
