package com.wagner.mms.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wagner.mms.bean.Customer;
import com.wagner.mms.service.TestService;

public class Demo {

	@Autowired
	private TestService service;
	
	private void test() {
		List<Customer> list = service.select();
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		new Demo().test();
	}

}
