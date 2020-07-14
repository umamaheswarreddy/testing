package com.example.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emp.entity.Employee;
import com.example.emp.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmpoyeeController {
	
	@Autowired
	EmployeeRepository repo;
	
	
	@GetMapping("/All")
	public List<Employee> getAll()
	{
		return repo.findAll();
	}
	
	@GetMapping("/test")
	public String test()
	{
		return "endhi ra khatha";
	}

}
