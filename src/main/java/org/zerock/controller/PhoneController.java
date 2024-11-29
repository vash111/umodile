package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.OrderVO;
import org.zerock.domain.ProductVO;
import org.zerock.service.OrderService;
import org.zerock.service.ProductService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/phone/*")
public class PhoneController {
	
	private final ProductService productService;
	private final OrderService orderService;
	
	@Autowired
	public PhoneController(ProductService productService,OrderService orderService) {
		this.productService = productService;
		this.orderService  = orderService;
	}
	
	@GetMapping("/phoneproduct") 
    public void phoneProductPage(Model model) {
	  
		List<ProductVO> products = productService.getProduct();
		model.addAttribute("products", products);
		
    }
  
    
    @GetMapping("/PhoneDetail") 
    public void phoneProductDetail(@RequestParam("cno") Long cno, Model model) {
        
    	ProductVO product = productService.read(cno);
    	
    	model.addAttribute("product", product);
    }
    
    @PostMapping("/add")
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
	
	//1대 1비교
    @GetMapping("/comparison")
    public String phoneComparison(Model model) {

    	List<ProductVO> productList = productService.getProduct();
        
        model.addAttribute("productList", productList);
        
        return "phone/comparison";
    }
}
