package com.example.LearnToday.Controller;

import java.util.List;import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LearnToday.Entity.Course;
import com.example.LearnToday.service.CourseService;

@RestController
public class AdminController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping("api/Admin")
	public List<Course> getAllCourses(){
		
		return service.getAllCourses();
		
	}
	
	
	@GetMapping("/api/{courseId}")
	public ResponseEntity<Course> getCourseById(@PathVariable int courseId){
		
		Course course = service.getCourseById(courseId);
		return ResponseEntity.ok(course);
	}
	
	
	@PostMapping("/api/course")
	public ResponseEntity<String> saveCourse(@RequestBody Course course){
		
		int id = service.saveCourse(course);
		String response = "course created"+ id;
		return ResponseEntity.ok(response);
	}
	

}
