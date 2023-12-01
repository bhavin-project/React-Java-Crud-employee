package com.example.myapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.model.EMPLOYEE;
import com.example.myapp.repository.employeeRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api/v1/")
@Transactional
@Service
public class employeeController {

	@Autowired
	employeeRepository empRepo;

	//@GetMapping("/employees")
//	public List<EMPLOYEE> getAllEmployee() {
//		return empRepo.findAll();
//	}
	
	@GetMapping("/employees")
	public List<EMPLOYEE> getbygroups() {
//		List<Object> countempldepat=empRepo.countEmployeesByDepartment();
		
		return empRepo.findAll();
	}
	
	
	
	@PostMapping("/createEmployee")
	public EMPLOYEE createEmployee(@RequestBody EMPLOYEE employee) {
		return empRepo.save(employee);
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Integer id) {
		// Retrieve the existing employee data from the database by ID
		EMPLOYEE existingEmployee = empRepo.findById(id).orElse(null);
		if (existingEmployee == null) {
			// Handle the case where the employee with the given ID doesn't exist
			return ResponseEntity.notFound().build();
		}

		// Delete the employee from the database
		empRepo.delete(existingEmployee);

		// Return a successful response (e.g., HTTP 204 No Content)
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<EMPLOYEE> updateEmployee(@PathVariable Integer id, @RequestBody EMPLOYEE updatedEmployee) {
		// Retrieve the existing employee data from the database by ID
		EMPLOYEE existingEmployee = empRepo.findById(id).orElse(null);

		if (existingEmployee == null) {
			// Handle the case where the employee with the given ID doesn't exist
			return ResponseEntity.notFound().build();
		}

		// Update the existing employee data with the new data
		existingEmployee.setEmpname(updatedEmployee.getEmpname());
		existingEmployee.setEmpemail(updatedEmployee.getEmpemail());
		existingEmployee.setEmppost(updatedEmployee.getEmppost());
		existingEmployee.setEmpc(updatedEmployee.getEmpc());
		existingEmployee.setEmpdate(updatedEmployee.getEmpdate());
		
		// Update other fields as needed

		// Save the updated employee data back to the database
		EMPLOYEE updated = empRepo.save(existingEmployee);

		// Return the updated employee data in the response
		return ResponseEntity.ok(updated);
	}
}
