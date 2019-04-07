package com.hand.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.entity.Emp;
import com.hand.mapper.EmpMapper;
import com.hand.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper;
	
	@Override
	public List<Emp> getEmp() {
		return empMapper.getAllEmp();
	}

}
