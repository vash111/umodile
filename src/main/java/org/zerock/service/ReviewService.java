package org.zerock.service;

import java.util.List;
import org.zerock.domain.ReviewVO;

public interface ReviewService {
<<<<<<< HEAD

    // 리뷰 + 사용자 이름 + 휴대폰 상세 정보 가져오기
    List<ReviewVO> getReviewsWithDetails();

    // 리뷰 작성
    boolean createReview(ReviewVO reviewVO);
    
    // 특정 휴대폰(vno)에 대한 리뷰 가져오기
    List<ReviewVO> getReviewsByPhone(Long vno);
=======
	
    void create(ReviewVO review);
    
    ReviewVO read(Long rno);
    
    List<ReviewVO> getAll();
>>>>>>> 2e99289055616f7091675884d76c17130fcb1f9d
}
