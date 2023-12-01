package com.example.myapp.model;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DEPARTMENT {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String deptname;
	
	@OneToMany(mappedBy = "departmentid")
	private List<EMPLOYEE> employees=new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<EMPLOYEE> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EMPLOYEE> employees) {
		this.employees = employees;
	}
	
	

}
