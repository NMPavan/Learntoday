package com.example.LearnToday.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LearnToday.Entity.Course;
import com.example.LearnToday.Entity.Student;
import com.example.LearnToday.Repoistory.CourseRepoistory;
import com.example.LearnToday.Repoistory.StudentRepoistory;
import com.example.LearnToday.payload.StudentDto;
import com.example.LearnToday.service.studentService;

@Service
public class StudentServiceImpl implements studentService {

	@Autowired
	private StudentRepoistory repo;

	@Autowired
	private CourseRepoistory courseRepo;

	private ModelMapper mapper;

	@Override
	public Student enrollStudent(StudentDto std) {

		int id = std.getCourseId();

		Course course = courseRepo.findById(id).get();

		Student student = new Student();

		student.setEnrollmentId(std.getEnrollmentId());
		student.setCourse(course);
		student.setStudentId(std.getStudentId());
		student.setCourse_data(std.getCourseId());

		Student studentData = repo.save(student);

		return studentData;
	}

	@Override
	public void deleteByEnrollId(int enrollmentId) {
		
		repo.deleteById(enrollmentId);
		
	}

}
