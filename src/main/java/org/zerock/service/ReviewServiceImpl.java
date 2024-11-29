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

    @Override
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
    }

    @Override
    public ReviewVO read(Long rno) {
        return reviewMapper.getReviewById(rno);
    }

    @Override
    public List<ReviewVO> getAll() {
        return reviewMapper.getAllReviews();
>>>>>>> 2e99289055616f7091675884d76c17130fcb1f9d
    }
}
