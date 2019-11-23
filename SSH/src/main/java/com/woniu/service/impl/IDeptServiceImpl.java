package com.woniu.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Service
@Transactional
public class IDeptServiceImpl implements IDeptService {

	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dept findOne(Integer deptno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
