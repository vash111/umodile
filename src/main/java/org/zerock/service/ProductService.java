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

	ProductVO getPhoneDetails(Long vno);
}