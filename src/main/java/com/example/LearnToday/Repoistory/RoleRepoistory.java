package com.example.LearnToday.Repoistory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LearnToday.Entity.Role;

public interface RoleRepoistory extends JpaRepository<Role, Integer> {
	
	Optional<Role> findByName(String name);

}
