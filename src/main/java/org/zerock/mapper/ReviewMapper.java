package org.zerock.mapper;

import java.util.List;
import org.zerock.domain.ReviewVO;

public interface ReviewMapper {

    // 리뷰 + 사용자 이름 + 휴대폰 상세 정보 가져오기
    List<ReviewVO> getReviewWithDetails();
    
    // 리뷰 삽입
    int insertReview(ReviewVO reviewVO);
    
    // 특정 휴대폰(vno)에 대한 리뷰 가져오기
    List<ReviewVO> getReviewsByPhone(Long vno);
}
