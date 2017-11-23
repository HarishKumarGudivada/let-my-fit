package com.nisum.lmf.demo.controller;

import java.awt.PageAttributes.MediaType;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nisum.lmf.demo.bo.Measurements;
import com.nisum.lmf.demo.bo.Order;
import com.nisum.lmf.demo.dto.CustomFittingsDto;
import com.nisum.lmf.demo.service.ProductServcie;

@RestController
@RequestMapping(value = "product")
public class ProductController {
	@Autowired
	private ProductServcie productService;

	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public ResponseEntity<?> getAllProducts() {

		return new ResponseEntity<List<Order>>(productService.getAllProducts(), HttpStatus.OK);
	}

	@RequestMapping(value = "/getproduct/{productID}", method = RequestMethod.GET)
	public ResponseEntity<?> getProductBYId(@PathVariable("productID") Integer productID) {

		return null;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveOrder(@RequestBody Order order) {

		// Order orderStatus=productService.saveMeasurementsWithOrder(order);
		// ResponseEntity<Order> response=new ResponseEntity<>(orderStatus,
		// HttpStatus.OK);
		return null;
	}

	@RequestMapping(value = "/saveorder/{userid}/{productid}", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
	public ModelAndView saveOrders(CustomFittingsDto customFittingsDto, @PathVariable("userid") String userid,
			@PathVariable("productid") Integer productID, @RequestParam("addFitting") Boolean addFitting) {

		Order order = new Order();
		order.setUserId(userid);
		order.setProductId(productID);
		order.setOrderNumber("CFN"+Math.random());
		order.setOrderDate(new Timestamp(System.currentTimeMillis()));
		order.setOrderStatus(1);
		order.setPrice(500d);
		ObjectMapper mapper = new ObjectMapper();
		String measurementJson;
		Measurements measurement = null;
		try {
			measurementJson = mapper.writeValueAsString(customFittingsDto);
			measurement = new Measurements();
			measurement.setMeasurements(measurementJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		order.setMeasurements(measurement);

		Order orderStatus = productService.saveMeasurementsWithOrder(order, addFitting);

		//ResponseEntity<Order> response = new ResponseEntity<>(orderStatus, HttpStatus.OK);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		mav.addObject("orderNumber", orderStatus.getOrderNumber());
		return mav;
	}

}
