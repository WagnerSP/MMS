package com.wagner.mms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagner.mms.bean.Customer;
import com.wagner.mms.dao.TestDao;

@Service
public class TestServiceImp implements TestService{

	@Autowired
	private TestDao dao;
	
	public List<Customer> select() {
		System.out.println("mmmm");
		return dao.select();

	}

	public void setDao() {
		this.dao = dao;
	}

	

	
	
	
	
}
