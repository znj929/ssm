package com.hand.mapper;

import java.util.List;

import com.hand.entity.Dept;
import com.hand.entity.Emp;

public interface EmpMapper {
	List<Emp> getAllEmp();
	List<Dept> getAllDept();
}
