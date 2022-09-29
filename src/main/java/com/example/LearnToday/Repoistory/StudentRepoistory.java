package com.example.LearnToday.Repoistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LearnToday.Entity.Student;

public interface StudentRepoistory extends JpaRepository<Student, Integer> {

}
