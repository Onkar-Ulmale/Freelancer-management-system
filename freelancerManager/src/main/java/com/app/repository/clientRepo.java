package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.client;

public interface clientRepo extends JpaRepository<client, Long>
{

	Optional<client> findByEmail(String email);
}
