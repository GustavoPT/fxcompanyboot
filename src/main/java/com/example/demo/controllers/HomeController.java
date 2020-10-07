package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.entities.Employee;
import com.example.demo.entities.User;

@Controller
public class HomeController {
	
	@Autowired
    EmployeeRepository ep;
    
	@Autowired
	UserRepository userRep;
	
	// query the
	@RequestMapping("/")
    public String welcome() {
        return "index";
    }
	
	@RequestMapping("/register")
	public String register(){
		return "reg";
	}
	// query the databse 
	// for a list of employees
	// pt them in there 
	// there 
	// there  
	// 
	@PostMapping("/register")
	public String register(@ModelAttribute User user,Model model) {
		
		
		System.out.println("adding to the db");
		
		return "index";
	}
	
    @RequestMapping("/employees")
    public String employees(Model model) {
    	
    	ArrayList<Employee> myEmployees;
    	
    	List<Employee> employees = (List<Employee>) ep.findAll();
//        System.out.println(employees);
//        System.out.println(employees.get(0).getFirstName());
//        
        model.addAttribute("employees",employees);
        
    	return "employees";
    }
    
    // make a resolver for a post request 
    
}