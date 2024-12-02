package org.zerock.mapper;

import java.util.List;
import org.zerock.domain.ReviewVO;

public interface ReviewMapper {
<<<<<<< HEAD

    // 리뷰 삽입 (성공적으로 삽입된 행의 수 반환)
    int insertReview(ReviewVO reviewVO);

    // 특정 리뷰 조회 (리뷰 ID로 조회)
    ReviewVO getReviewById(Long rno);

    // 특정 휴대폰(vno)에 대한 리뷰 조회
    List<ReviewVO> getReviewsByPhone(Long vno);

    // 리뷰 + 사용자 이름 + 휴대폰 상세 정보 조회
    List<ReviewVO> getReviewWithDetails();
=======
<<<<<<< HEAD

    // 리뷰 + 사용자 이름 + 휴대폰 상세 정보 가져오기
    List<ReviewVO> getReviewWithDetails();
    
    // 리뷰 삽입
    int insertReview(ReviewVO reviewVO);
    
    // 특정 휴대폰(vno)에 대한 리뷰 가져오기
    List<ReviewVO> getReviewsByPhone(Long vno);
=======
	
    void insertReview(ReviewVO review);
    
    ReviewVO getReviewById(Long rno);
    
    List<ReviewVO> getAllReviews();
>>>>>>> 2e99289055616f7091675884d76c17130fcb1f9d
>>>>>>> 99e6f925d48fc691c06b209e15af124923129af5
}
