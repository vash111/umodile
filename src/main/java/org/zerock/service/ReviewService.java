package org.zerock.service;

import java.util.List;
import org.zerock.domain.ReviewVO;

public interface ReviewService {
	
    void create(ReviewVO review);
    
    ReviewVO read(Long rno);
    
    List<ReviewVO> getAll();
}
