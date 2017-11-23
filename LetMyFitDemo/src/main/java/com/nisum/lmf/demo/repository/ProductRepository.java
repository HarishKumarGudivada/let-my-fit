package com.nisum.lmf.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.nisum.lmf.demo.bo.Order;

public interface ProductRepository extends CrudRepository<Order, Integer>{

}
