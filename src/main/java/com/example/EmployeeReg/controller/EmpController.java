/**
 * 
 */
package com.example.EmployeeReg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeReg.model.Emp;
import com.example.EmployeeReg.service.Empservice;

/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/emp/registration")
@CrossOrigin("*")
public class EmpController {
	
	@Autowired
    private Empservice employeeService;

    @PostMapping("/addemp")
    public Emp addEmployee(@RequestBody Emp employee) {
        return employeeService.createEmployee(employee);
    }
    
    @GetMapping("/employees")
    public List<Emp> getAllEmployee(){
    	return employeeService.getEmployees();
    }
    
    @GetMapping("/employees/{id}")
    public Emp getEmployeeById(@PathVariable int id) {
    	return employeeService.getEmployeeById(id);
    }
    
    @PutMapping("/updateemployee/{id}")
    public Emp updateEmployee(@RequestBody Emp employee) {
    return employeeService.updateEmployee(employee);
    }
    
    @DeleteMapping("/deleteemployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
    	return employeeService.deleteEmployeeById(id);
    }

}



