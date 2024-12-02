package org.zerock.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.zerock.domain.ReviewVO;
import org.zerock.service.ReviewService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    // 리뷰 작성 페이지 이동
    @GetMapping("/create")
    public String createForm(@RequestParam Long uno, 
                             @RequestParam Long vno, 
                             Model model) {
        // uno와 vno를 모델에 추가
        model.addAttribute("uno", uno);
        model.addAttribute("vno", vno);
        model.addAttribute("review", new ReviewVO());
        return "user/review"; // 리뷰 작성 페이지로 이동
    }

    // 리뷰 작성 요청 처리
    @PostMapping("/create")
    public String create(@RequestParam Long uno, 
                         @RequestParam Long vno, 
                         @RequestParam String title, 
                         @RequestParam String content, 
                         Model model) {
        // ReviewVO 객체 생성 및 값 설정
        ReviewVO reviewVO = new ReviewVO();
        reviewVO.setUno(uno);
        reviewVO.setVno(vno);
        reviewVO.setTitle(title);
        reviewVO.setContent(content);

        // 리뷰 데이터 삽입
        boolean isInserted = reviewService.createReview(reviewVO);

        // 성공 여부 처리
        if (isInserted) {
            model.addAttribute("message", "리뷰가 성공적으로 작성되었습니다.");
            return "redirect:/user/checkdetails"; // 리뷰 목록 페이지로 리다이렉트
        } else {
            model.addAttribute("message", "리뷰 작성에 실패했습니다.");
            return "user/review"; // 작성 페이지로 다시 이동
        }
    }

    // 리뷰 + 사용자 이름 + 휴대폰 상세 정보 가져오기
    @GetMapping("/details")
    public String getReviewsWithDetails(Model model) {

    	List<ReviewVO> reviews = reviewService.getReviewsWithDetails();

        model.addAttribute("reviews", reviews);

        return "users/checkdetails";
    }
}
