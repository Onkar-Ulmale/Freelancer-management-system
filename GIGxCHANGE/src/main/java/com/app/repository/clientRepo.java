package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.client;

public interface clientRepo extends JpaRepository<client, Integer>
{


}
