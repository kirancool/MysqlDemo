package com.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.service.EmpService;
import com.mysql.service.EmpServiceImpl;

@Controller
@RequestMapping(value="/emp")
public class EmpController {
	@Autowired
	EmpService empService;
	@Autowired
	EmpServiceImpl empServiceImpl;
	
	@RequestMapping(value="/getName",method=RequestMethod.GET)
	public @ResponseBody String getName(@RequestParam(value="id")int id,@RequestParam(value="name")String name,@RequestParam(value="location")String location)
	{
		return empService.getName(id,name,location);
		
	}

}
