package com.SpringBoot.CrudDemoEmp.Dao;

import com.SpringBoot.CrudDemoEmp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "Members")
public interface EmployeeRepository extends JpaRepository<Employee , Integer> {


    //thats it ...no need ito write any methods


}
