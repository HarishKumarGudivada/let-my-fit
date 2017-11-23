package com.nisum.lmf.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.lmf.demo.dto.OrderDetailsDto;
import com.nisum.lmf.demo.service.MailingService;

@RestController
public class FittingsController {

	@Autowired
	MailingService  mailService;
	
	
	@GetMapping(value="/getOrderDetails",produces = "application/json")
	public ModelAndView loadOrderDetails(){
		List<OrderDetailsDto> list=new ArrayList<>();
		OrderDetailsDto dto1=new OrderDetailsDto();
		dto1.setOrderId(1);
		dto1.setUserId("harishkumar.gudivada@gmail.com");
		dto1.setFittings("{fittings:[{fittingType:Shoulder,size:25cm},{fittingType:Wrist,size:8cm}]}");

		
		OrderDetailsDto dto2=new OrderDetailsDto();
		dto2.setOrderId(2);
		dto2.setUserId("harishkumar.gudivada@gmail.com");
		dto2.setFittings("{fittings:[{fittingType:Shoulder,size:30cm},{fittingType:Wrist,size:10cm}]}");
	
		list.add(dto1);
		list.add(dto2);
		return new ModelAndView("orderApproval","orderDetails",list);
		
	}

	@PostMapping(value="/approveOrder/{orderId}/{addPrice}/{orderNo}", produces = "application/json")
	public void approveOrder(@PathVariable("orderId") int orderId,@PathVariable("addPrice") double addPrice,@PathVariable("orderNo") String   orderNo){
		String userId="hgudivada@nisum.com";
		mailService.sendMail(userId,2,addPrice,orderNo);
		
	}
	
	@PostMapping(value="/rejectOrder/{orderId}/{orderNo}", produces = "application/json")
	public void rejectOrder(@PathVariable("orderId") int orderId,@PathVariable("orderNo") String   orderNo){
		String userId="hgudivada@nisum.com";
		mailService.sendMail(userId,3,0,orderNo);
	}
	
		
}
