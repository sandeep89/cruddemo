package com.luv2code.springboot.cruddemo.rest;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.EmployeeEntity;
@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	 
	@Autowired
	private EmployeeDAO employeeDAO;

    @GetMapping("/employees")
    public List<EmployeeEntity> findAll(){
    
    	return employeeDAO.findAll();
    }

}




