package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;
import org.zerock.service.ProductService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/phone")
public class PhoneController {
	
	private final ProductService productService;
	
	@Autowired
	public PhoneController(ProductService productService) {
		this.productService = productService;
	}
	
    @GetMapping("/phoneproduct") 
    public String phoneProductPage() {
        return "phone/phoneproduct"; 
    }
    
    
    @GetMapping("/PhoneDetail") 
    public String phoneProductDetail() {
        return "phone/PhoneDetail"; 
    }
    
    @GetMapping("/comparison")
    public String phoneComparison(Model model) {

    	List<ProductVO> productList = productService.getProduct();
        
        model.addAttribute("productList", productList);
        
        return "phone/comparison";
    }
}
