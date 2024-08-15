package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Skills;

public interface skillsRepo extends JpaRepository<Skills, Integer> {

}
