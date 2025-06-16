package com.joaodev.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.projectspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
