package org.zerock.service;

import java.util.List;
<<<<<<< HEAD
import org.springframework.stereotype.Service;
import org.zerock.domain.ReviewVO;
import org.zerock.mapper.ReviewMapper;
=======

import org.springframework.stereotype.Service;
import org.zerock.domain.ReviewVO;
import org.zerock.mapper.ReviewMapper;

>>>>>>> 2e99289055616f7091675884d76c17130fcb1f9d
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewMapper reviewMapper;

    // 리뷰 생성
    @Override
<<<<<<< HEAD
    public boolean createReview(ReviewVO reviewVO) {
        // 실행된 행(row)의 개수를 반환받아 1 이상이면 true 반환
        return reviewMapper.insertReview(reviewVO) > 0;
=======
<<<<<<< HEAD
    public List<ReviewVO> getReviewsWithDetails() {
        return reviewMapper.getReviewWithDetails();
    }
    
    @Override
    public boolean createReview(ReviewVO reviewVO) {
        return reviewMapper.insertReview(reviewVO) == 1; // 성공 여부 반환
    }
    
    @Override
    public List<ReviewVO> getReviewsByPhone(Long vno) {
        return reviewMapper.getReviewsByPhone(vno);
=======
    public void create(ReviewVO review) {
        reviewMapper.insertReview(review);
>>>>>>> 99e6f925d48fc691c06b209e15af124923129af5
    }

    // 특정 리뷰 조회
    @Override
    public ReviewVO read(Long rno) {
        return reviewMapper.getReviewById(rno);
    }

    // 특정 휴대폰(vno)에 대한 리뷰 가져오기
    @Override
<<<<<<< HEAD
    public List<ReviewVO> getReviewsByPhone(Long vno) {
        return reviewMapper.getReviewsByPhone(vno);
    }

    // 리뷰 + 사용자 이름 + 휴대폰 상세 정보 가져오기
    @Override
    public List<ReviewVO> getReviewsWithDetails() {
        return reviewMapper.getReviewWithDetails();
=======
    public List<ReviewVO> getAll() {
        return reviewMapper.getAllReviews();
>>>>>>> 2e99289055616f7091675884d76c17130fcb1f9d
>>>>>>> 99e6f925d48fc691c06b209e15af124923129af5
    }
}
