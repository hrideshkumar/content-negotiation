package com.api.content;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class APIController {

	@GetMapping(produces = { "application/json", "application/xml" })
	public List<Employee> getAllEmployee(){
		return getEmployees();
	}
	
	private List<Employee> getEmployees(){
		return List.of(new Employee(1, "Om"), new Employee(2, "Ram"), new Employee(3, "Jam"), new Employee(4, "Sam"), new Employee(5, "Jax"));
	}
}
