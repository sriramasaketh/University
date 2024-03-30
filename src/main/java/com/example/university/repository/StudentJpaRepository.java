package com.example.unversity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.unversity.model.*;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Integer>{
    
}