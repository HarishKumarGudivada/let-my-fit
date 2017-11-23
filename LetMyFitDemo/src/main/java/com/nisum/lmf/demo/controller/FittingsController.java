package com.nisum.lmf.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.lmf.demo.service.MailingService;
import com.nisum.lmf.demo.service.ProductServcie;

@RestController
public class FittingsController {
	
	@Autowired
	private ProductServcie productService;

	@Autowired
	MailingService  mailService;
	
	
	@GetMapping(value="/getOrderDetails",produces = "application/json")
	public ModelAndView loadOrderDetails(){
		return new ModelAndView("orderApproval","orderDetails",productService.loadAllOrders());
	}

	@PostMapping(value="/approveOrder/{orderId}/{addPrice}/{orderNo}", produces = "application/json")
	public void approveOrder(@PathVariable("orderId") int orderId,@PathVariable("addPrice") double addPrice,@PathVariable("orderNo") String   orderNo){
		String userId="hgudivada@nisum.com";
		productService.updateStatusAndAddPrice(orderId,2,addPrice);
		mailService.sendMail(userId,2,addPrice,orderNo);
		
	}
	
	@PostMapping(value="/rejectOrder/{orderId}/{orderNo}", produces = "application/json")
	public void rejectOrder(@PathVariable("orderId") int orderId,@PathVariable("orderNo") String   orderNo){
		String userId="hgudivada@nisum.com";
		productService.updateStatusAndAddPrice(orderId,3,0);
		mailService.sendMail(userId,3,0,orderNo);
	}
	
		
}
