package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;

@Controller
public class DeptAction {
	@Autowired
	private IDeptService ds;
	
	public String save(Dept dept) {
		
		return null;
	}
}
  