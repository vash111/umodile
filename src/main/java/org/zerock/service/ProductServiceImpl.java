package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.ProductVO;
import org.zerock.mapper.ProductMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	@Autowired
	private final ProductMapper mapper;
	
	
	@Override //상품리스트 불러오기
	public List<ProductVO> getProduct() {
		
		List<ProductVO> list = mapper.getProduct();
		return list;
	}


	@Override //상품상세정보 가져오기
	public ProductVO read(long cno) {
		
		ProductVO productVO = new ProductVO();
		
		productVO = mapper.read(cno);
		
		return productVO;
	}


	 @Override
	 public List<ProductVO> getSelectedProducts(List<Long> cnoList) {
	    return mapper.getSelectedProducts(cnoList);
	 }
	
	 
	 @Override
	 public ProductVO getPhoneDetails(Long vno) {
	     return mapper.getPhoneDetails(vno); // ProductMapper 호출
	 }
	

}