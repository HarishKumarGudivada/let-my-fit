package com.nisum.lmf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
