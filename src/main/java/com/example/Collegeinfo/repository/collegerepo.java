package com.example.Collegeinfo.repository;

import com.example.Collegeinfo.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface collegerepo extends JpaRepository<College,Integer> {

}
