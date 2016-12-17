package com.wagner.mms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wagner.mms.bean.Customer;


public interface TestDao {

	@Select("select * from customers")
	public List<Customer> select();
	
}
