package com.example.springcrud.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springcrud.entitys.EntityComponent;

public interface Repository extends JpaRepository<EntityComponent,Long>{
}
