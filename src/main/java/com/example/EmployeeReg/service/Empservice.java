package com.example.EmployeeReg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeReg.model.Emp;
import com.example.EmployeeReg.repository.EmpRepository;

@Service
public class Empservice {
	@Autowired
	private EmpRepository empRepository;

	public Emp createEmployee(Emp employee) {
		// TODO Auto-generated method stub
		return empRepository.save(employee);
	}

	

	



	public List<Emp> getEmployees() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}



	public Emp getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return empRepository.findById(id).orElse(null);
	}







	public Emp updateEmployee(Emp employee) {
		// TODO Auto-generated method stub
		Emp oldemp=null;
		Optional<Emp> optionalemployee=empRepository.findById(employee.getId());
		if(optionalemployee.isPresent())
		{
			oldemp=optionalemployee.get();
			oldemp.setId(employee.getId());
			oldemp.setName(employee.getName());
			oldemp.setEmail(employee.getEmail());
			oldemp.setExperience(employee.getExperience());
			oldemp.setDomain(employee.getDomain());
			empRepository.save(oldemp);
			}
		else
		{
			return new Emp();
		}
		
		
		return oldemp;
		
	}







	public String deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		empRepository.deleteById(id);
		return "the employee information is deleted";
	}

	

}
