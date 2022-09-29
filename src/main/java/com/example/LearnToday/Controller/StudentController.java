package com.example.LearnToday.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LearnToday.Entity.Course;
import com.example.LearnToday.Entity.Student;
import com.example.LearnToday.Repoistory.StudentRepoistory;
import com.example.LearnToday.payload.StudentDto;
import com.example.LearnToday.service.studentService;

@RestController
public class StudentController {

	@Autowired
	private StudentRepoistory repo;
	
	@Autowired
	private studentService service;

	@GetMapping("/api/getallcourses")
	public List<Course> getAllCourse() {
		List<Course> list = repo.findAllCourses();
		return list;

	}
	
	@PostMapping("/api/students")
	public ResponseEntity<Student> enrollStudentCourse(@RequestBody StudentDto std){
		
		System.out.println("std"+ std);
		
		Student student = service.enrollStudent(std);
		
		System.out.println("student"+ student);
		
		return ResponseEntity.ok(student);
		
		
	}
	
	@DeleteMapping("/api/delete/{enrollmentId}")
	public ResponseEntity<String> deleteStudentByEnrollmentId(@PathVariable int enrollmentId){
		
		

		service.deleteByEnrollId(enrollmentId);
		String msg =" id successfully deleted" + enrollmentId;
		
		return ResponseEntity.ok(msg);
		
		
	}
	
	
}
