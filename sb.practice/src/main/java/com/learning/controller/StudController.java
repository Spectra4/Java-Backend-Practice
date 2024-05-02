package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Student;
import com.learning.repository.Stud_Repository;

@RestController
public class StudController {

	@Autowired
	private Stud_Repository repo;
	
	@PostMapping("/save-student")
	public String saveStudent(@RequestBody Student stud) {
		repo.save(stud);
		return "Save Student Successfully...";		
	}
	
	@DeleteMapping("/delete-student-by-id")
	public String deleteStudent(@RequestParam("id") int id){
		repo.deleteById(id);
		return "Student Delete Successfully...";
	}
	
	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student stud) {
		repo.save(stud);
		return "Student Update Successfully...";
	}
	
	@GetMapping("/get-student-list")
	public List<Student> getStudentList(){
		return repo.findAll();
	}
	
	 @PutMapping("/updatename")
	    public String updateName(@RequestParam String oldName, @RequestParam String newName) {
	        int updatedCount = repo.updateName(oldName, newName);
			return updatedCount + " Name update Successfully...";
	}
}
