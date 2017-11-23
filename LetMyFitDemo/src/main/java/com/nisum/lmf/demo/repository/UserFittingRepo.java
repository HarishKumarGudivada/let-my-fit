package com.nisum.lmf.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.nisum.lmf.demo.bo.UserFittingsBo;

public interface UserFittingRepo extends CrudRepository<UserFittingsBo,Integer>{

}
