package com.example.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.myapp.model.cityModel;
import com.example.myapp.model.studentModel;
@Repository
@EnableJpaRepositories
public interface studentRepo extends JpaRepository<studentModel, Integer> {
	
//List<studentModel> findByFirst_name(String first_name);
//	List<studentModel> findByStatus(String status);
		//List<studentModel> findByFirst_nameAndLast_name(String first_name,String last_name);
		List<studentModel> findByFirstnameContainingIgnoreCaseOrLastnameContainingIgnoreCaseOrStatus(String firstname,String lastname,String status);
		List<studentModel> findByEmailid(String emailid);
	
}
