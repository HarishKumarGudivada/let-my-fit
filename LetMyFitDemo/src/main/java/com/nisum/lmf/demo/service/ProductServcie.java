package com.nisum.lmf.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nisum.lmf.demo.bo.Order;
import com.nisum.lmf.demo.dto.CustomFittingsDto;

public interface ProductServcie {
	public List<Order> getAllProducts();
	public Order saveMeasurementsWithOrder(Order order,boolean addFtting);
	public Order saveCustomSettings(CustomFittingsDto customFittingsDto);
}
