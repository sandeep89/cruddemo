package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.entity.EmployeeEntity;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public List<EmployeeEntity> findAll() {
		// TODO Auto-generated method stub
		Session currentSession=entityManager.unwrap(Session.class);
		Query<EmployeeEntity> theQuery=currentSession.createQuery("FROM EmployeeEntity",EmployeeEntity.class);
		
		List<EmployeeEntity> employees=theQuery.getResultList();
		return employees;
	}

}
