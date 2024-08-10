package com.spring.preon.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.preon.dao.ProDAO;

@Service
public class ProServiceImpl implements ProService{
	
	@Autowired
	private ProDAO dao;

	@Override
	public String bringData() {
		// TODO Auto-generated method stub
		return dao.bringData();
	}
	

}
