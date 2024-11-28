package org.zerock.service;

import java.util.List;

import org.zerock.domain.ReviewVO;

public interface ReviewService {
		// 공지사항 생성
		void create(ReviewVO notice);

		// 리뷰 읽기
		ReviewVO read(Long rno);

		// 리뷰 수정
		void update(ReviewVO review);

		// 리뷰 삭제
		void delete(Long rno);

		// 검색 기능 추가
		List<ReviewVO> searchPosts(String keyword, int offset, int limit);

		// 모든 리뷰 가져오기
		List<ReviewVO> getAll();

		// 페이징을 위한 리뷰 가져오기
		List<ReviewVO> getAllWithPaging(int offset, int limit);
		
		//구매 고객 vno 확인
		boolean checkUserHasVno(Long uno, Long vno);
}
