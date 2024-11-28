package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.ReviewVO;

public interface ReviewMapper {
	
		//유저 vno 검증
		int checkUserHasVno(@Param("uno") Long uno, @Param("vno") Long vno);

		// 리뷰 등록
		void create(ReviewVO review);

		// 리뷰 조회
		ReviewVO read(Long rno);

		// 리뷰 수정
		void update(ReviewVO review);

		// 리뷰 삭제
		void delete(Long rno);

		// 모든 리뷰 가져오기
		List<ReviewVO> getAll();

		// 리뷰 목록 (페이징 처리)
		List<ReviewVO> getAllWithPaging(@Param("offset") int offset, @Param("limit") int limit);
		
		// 검색 기능 추가
	    List<ReviewVO> searchPosts(@Param("keyword") String keyword, @Param("offset") int offset, @Param("limit") int limit);
	
}
