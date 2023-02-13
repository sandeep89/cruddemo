package com.luv2code.springboot.cruddemo.dao;
import java.util.*;

import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.EmployeeEntity;

@Repository
public interface EmployeeDAO {

	public List<EmployeeEntity> findAll();
	
}
