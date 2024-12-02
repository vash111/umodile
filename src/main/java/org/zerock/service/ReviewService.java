package org.zerock.service;

import java.util.List;
import org.zerock.domain.ReviewVO;

public interface ReviewService {
<<<<<<< HEAD
=======
<<<<<<< HEAD

    // 리뷰 + 사용자 이름 + 휴대폰 상세 정보 가져오기
    List<ReviewVO> getReviewsWithDetails();

    // 리뷰 작성
    boolean createReview(ReviewVO reviewVO);
    
    // 특정 휴대폰(vno)에 대한 리뷰 가져오기
    List<ReviewVO> getReviewsByPhone(Long vno);
=======
	
    void create(ReviewVO review);
>>>>>>> 99e6f925d48fc691c06b209e15af124923129af5
    
    // 리뷰 작성
    boolean createReview(ReviewVO reviewVO);
    
    // 특정 리뷰 조회
    ReviewVO read(Long rno);

    // 특정 휴대폰(vno)에 대한 리뷰 가져오기
    List<ReviewVO> getReviewsByPhone(Long vno);
    
<<<<<<< HEAD
    // 리뷰 + 사용자 이름 + 휴대폰 상세 정보 가져오기
    List<ReviewVO> getReviewsWithDetails();
=======
    List<ReviewVO> getAll();
>>>>>>> 2e99289055616f7091675884d76c17130fcb1f9d
>>>>>>> 99e6f925d48fc691c06b209e15af124923129af5
}
