package com.wagner.mms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wagner.mms.bean.Customer;
import com.wagner.mms.service.TestService;

@Controller
public class HomeController {
	
	@Autowired
	private TestService service;
	
	@RequestMapping({"/", "index", "home"})
	public String home() {
		List<Customer> list = service.select();
		int i = 0;
		for (Customer customer : list) {
			System.out.println(++i + " " + customer);
		}
		
		return "home";
	}

	public void setService(TestService service) {
		this.service = service;
	}
	
	
}
