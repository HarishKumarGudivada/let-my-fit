package com.nisum.lmf.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.lmf.demo.bo.Measurements;

@RestController
@RequestMapping(value="fitting")
public class FittingsController {
	
	
	public ResponseEntity<?> saveFittings(@RequestBody String measurements)
	{
		return null;
	}
	
	

}
