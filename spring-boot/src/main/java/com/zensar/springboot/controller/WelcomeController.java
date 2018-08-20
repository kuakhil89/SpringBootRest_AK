package com.zensar.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.springboot.beans.Employee;

@RestController
public class WelcomeController {
	@RequestMapping(value="/employee")
	public Employee[] getAllEmployee()
	{
		System.out.println("AAAAA");
		 Employee[] employees=new Employee[3];
		Employee employee1=new Employee(1001,"Ram",10);
		Employee employee2=new Employee(1001,"shyam",11);
		Employee employee3=new Employee(1001,"kiran",12);
		
		employees[0]=employee1;
		employees[1]=employee2;
		employees[2]=employee3;
		
		return employees;
		
	}
}
