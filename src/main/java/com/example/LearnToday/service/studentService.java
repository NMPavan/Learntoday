package com.example.LearnToday.service;

import com.example.LearnToday.Entity.Student;
import com.example.LearnToday.payload.StudentDto;

public interface studentService {

	
    Student enrollStudent(StudentDto std);
    void deleteByEnrollId(int enrollmentId);
}
