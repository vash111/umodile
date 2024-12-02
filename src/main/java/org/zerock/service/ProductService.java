package org.zerock.service;

import java.util.List;

import org.zerock.domain.ProductVO;

public interface ProductService {
	
	//전체 상품 리스트 SQL
	public List<ProductVO> getProduct();

	//1개 상품정보 읽는 SQL (상세페이지 용도)
	public ProductVO read(long cno);
	
	// 선택된 두 상품 정보 가져오기
    List<ProductVO> getSelectedProducts(List<Long> cnoList);
<<<<<<< HEAD
    
    ProductVO getPhoneDetails(Long vno);
=======
<<<<<<< HEAD

	ProductVO getPhoneDetails(Long vno);
=======
>>>>>>> 2e99289055616f7091675884d76c17130fcb1f9d
>>>>>>> 99e6f925d48fc691c06b209e15af124923129af5
}