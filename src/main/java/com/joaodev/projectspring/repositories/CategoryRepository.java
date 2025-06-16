package com.joaodev.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.projectspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
