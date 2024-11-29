package org.zerock.mapper;

import java.util.List;
import org.zerock.domain.ReviewVO;

public interface ReviewMapper {
	
    void insertReview(ReviewVO review);
    
    ReviewVO getReviewById(Long rno);
    
    List<ReviewVO> getAllReviews();
}
