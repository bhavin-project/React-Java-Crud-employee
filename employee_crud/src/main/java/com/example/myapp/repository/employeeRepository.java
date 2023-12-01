package com.example.myapp.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.myapp.model.EMPLOYEE;

public interface employeeRepository extends JpaRepository<EMPLOYEE, Integer> {

//	@Query("SELECT e FROM EMPLOYEE e ")
//	List<EMPLOYEE> findAllEmployeesWithDepartmentAndPhones(Integer deptid);
	
	@Query("select count(e),d.deptname from EMPLOYEE e join e.departmentid d group by d.deptname")
	List<Object> countEmployeesByDepartment();
	
}
