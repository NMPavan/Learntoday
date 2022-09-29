package com.example.LearnToday.Repoistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LearnToday.Entity.Trainer;

public interface TrainerRepoistory extends JpaRepository<Trainer, Integer> {

}
