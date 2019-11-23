package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptService {
	void save(Dept dept);

	void update(Dept dept);

	void delete(Integer deptno);

	Dept findOne(Integer deptno);

	List<Dept> findAll();
}
