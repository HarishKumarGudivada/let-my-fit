package com.nisum.lmf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.lmf.demo.dto.CustomFittingsDto;

@Controller
public class HomeController {
	
	@RequestMapping("/fittingsdemo")
	   public String fittingsDemo() {
		
	      return "fittingsdemo";
	   }

	   @RequestMapping("/yourtruefit")
	   public String findyourTruefit() {
		
	      return "yourtruefit";
	   }
	   @RequestMapping("/accept")
	   public String accept() {
		
	      return "accept";
	   }
	   @RequestMapping("/orderCheckout")
	   public String orderCheckout() {
		
	      return "/orderCheckout";
	   }
	   @RequestMapping("/success")
	   public String success() {
		
	      return "/success";
	   }
	   
	   @RequestMapping("/customfittings")
	   public ModelAndView kurthiFittings() {
	       return new ModelAndView("customfittings", "command", new CustomFittingsDto());
	   }
	    
	   @RequestMapping(value = "/addFittings", method = RequestMethod.POST)
	   public void addKurthiFittings(@ModelAttribute("CustomFittingsDto") CustomFittingsDto customFittingsDto ) {
	   //model.addAttribute("kurthiFittingsDto", new KurthiFittingsDto());
	       System.out.println(customFittingsDto.toString());
	   }
	   
	   
}
