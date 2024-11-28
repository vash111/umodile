package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.ReviewVO;
import org.zerock.mapper.ReviewMapper;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	private ReviewMapper mapper;
	
	@Override
	public boolean checkUserHasVno(Long uno, Long vno) {
	    return mapper.checkUserHasVno(uno, vno) > 0;
	}

	
	@Override
	public void create(ReviewVO review) {
		mapper.create(review);
	}

	@Override
	public ReviewVO read(Long rno) {
		return mapper.read(rno);
	}

	@Override
	public void update(ReviewVO review) {
		mapper.update(review);
		
	}

	@Override
	public void delete(Long rno) {
		mapper.delete(rno);
	}

	@Override
	public List<ReviewVO> searchPosts(String keyword, int offset, int limit) {
		return mapper.searchPosts(keyword, offset, limit);
	}

	@Override
	public List<ReviewVO> getAll() {
		return mapper.getAll();
	}

	@Override
	public List<ReviewVO> getAllWithPaging(int offset, int limit) {
		return mapper.getAllWithPaging(offset, limit);
	}

}
