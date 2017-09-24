package com.mysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.Dao.EmpDao;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	@Autowired
	EmpDao empDao;

	public String getName(int id, String name, String location) {
	
		return empDao.getName(id, name, location);
	}

	
	
	


}
