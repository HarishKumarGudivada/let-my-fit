package com.nisum.lmf.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nisum.lmf.demo.bo.Order;
import com.nisum.lmf.demo.bo.UserFittingsBo;
import com.nisum.lmf.demo.dto.CustomFittingsDto;
import com.nisum.lmf.demo.dto.OrderDto;
import com.nisum.lmf.demo.repository.ProductRepository;
import com.nisum.lmf.demo.repository.UserFittingRepo;
import com.nisum.lmf.demo.service.ProductServcie;
@Component
public class ProductServiceImpl implements ProductServcie {
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private UserFittingRepo userFittingRepository;
	@Override
	public List<Order> getAllProducts() {
		// TODO Auto-generated method stub
		return (List<Order>) productRepository.findAll();
	}

	@Override
	public Order saveMeasurementsWithOrder(Order order,boolean addFtting) {
		Order o=null;

		o= productRepository.save(order);
		OrderDto orderDto=new OrderDto();
		if(addFtting) {
			UserFittingsBo userFittingsBo=new UserFittingsBo();
				userFittingsBo.setUserid(order.getUserId());
				userFittingsBo.setCatid(1);  //we will get it from path param or through order
				userFittingsBo.setFittingid(order.getMeasurements().getId()); //gets the fitting id
				
			userFittingRepository.save(userFittingsBo);
		}
		return o;
		
	}

	@Override
	public Order saveCustomSettings(CustomFittingsDto customFittingsDto) {
		
		return null;
	}

}
