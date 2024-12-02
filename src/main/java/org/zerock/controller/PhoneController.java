package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.OrderVO;
import org.zerock.domain.ProductVO;
import org.zerock.domain.ReviewVO;
import org.zerock.service.NoticeService;
import org.zerock.service.OrderService;
import org.zerock.service.ProductService;
import org.zerock.service.ReviewService;
import org.zerock.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/phone/*")
@RequiredArgsConstructor
public class PhoneController {
	
	private final ProductService productService;
	private final OrderService orderService;
	private final ReviewService reviewService;
	
	@GetMapping("/phoneproduct") 
    public void phoneProductPage(Model model) {
	  
		List<ProductVO> products = productService.getProduct();
		model.addAttribute("products", products);
		
    }
  
	// 휴대폰 상세 페이지 (상세 정보 + 리뷰 데이터 통합)
	@GetMapping("/PhoneDetail")
	public String phoneProductDetail(@RequestParam("cno") Long cno, Model model) {
	    ProductVO product = productService.read(cno);
	    List<ReviewVO> reviews = reviewService.getReviewsByPhone(cno);
	    model.addAttribute("product", product);
	    model.addAttribute("reviews", reviews);
	    return "phone/PhoneDetail";
	}
    
    @PostMapping("/phone/add")
    public String phoneAdd(
    		@RequestParam("uno") long uno,
    		@RequestParam("cno") long cno,
    		@RequestParam("phonecolor") String color,
    		@RequestParam("installment") String installment ,
    		@RequestParam("vatPrice") double vatPrice,
    		Model model){

    	OrderVO orderVO = new OrderVO();
    	
    	orderVO.setUno(uno);
    	orderVO.setCno(cno);
    	orderVO.setColor(color);
    	orderVO.setInstallment(installment);
    	orderVO.setVatPrice(vatPrice);
    	
    	model.addAttribute("msg", "success");

    	orderService.addPhone(orderVO);
    	
    	return "redirect:/phone/phoneproduct";
    }
    
    
    @GetMapping("/user/login") 
    public String userLogin() {
		
    	return "user/login";
    }
	
    //////////////////////////////////////////////////////////////////////
    
    
	//상품 1대 1비교
    @GetMapping("/comparison")
    public String phoneComparison(Model model) {

    	List<ProductVO> productList = productService.getProduct();
        
        model.addAttribute("productList", productList);
        
        return "phone/comparison";
    }
    
}
