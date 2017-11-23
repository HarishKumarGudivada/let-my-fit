package com.nisum.lmf.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nisum.lmf.demo.bo.Order;

public interface ProductRepository extends CrudRepository<Order, Integer>{

	
	public List<Order> findByOrderStatus(Integer orderStatus);
	
}
