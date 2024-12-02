package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.ProductVO;


public interface ProductMapper {
	
	//전체리스트 가져오기
	public List<ProductVO> getProduct();

	//1개 상품 정보 가져오기(상세페이지 표출용)
	public ProductVO read(Long cno);
	
	// 선택된 두 상품 정보 가져오기
    List<ProductVO> getSelectedProducts(List<Long> cnoList);
<<<<<<< HEAD
    
    // 특정 휴대폰 상세 정보 가져오기 (PhoneDetail.jsp 리뷰용)
    ProductVO getPhoneDetails(Long vno);
=======
<<<<<<< HEAD
    
    // 특정 휴대폰 상세 정보 가져오기 (PhoneDetail.jsp 리뷰용)
    ProductVO getPhoneDetails(Long vno);
=======
>>>>>>> 2e99289055616f7091675884d76c17130fcb1f9d
>>>>>>> 99e6f925d48fc691c06b209e15af124923129af5
}