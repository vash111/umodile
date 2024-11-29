package org.zerock.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.zerock.domain.ReviewVO;
import org.zerock.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewMapper reviewMapper;

    @Override
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
    }
}
