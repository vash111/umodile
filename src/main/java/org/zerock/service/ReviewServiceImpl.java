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
    }
}
