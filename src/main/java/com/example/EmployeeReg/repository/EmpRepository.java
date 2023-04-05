package com.example.EmployeeReg.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeReg.model.Emp;
@Repository

public interface EmpRepository extends JpaRepository<Emp, Integer> {

}
