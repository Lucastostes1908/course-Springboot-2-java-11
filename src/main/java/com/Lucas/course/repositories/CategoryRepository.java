package com.Lucas.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lucas.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

	

}
