package com.joaodev.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.projectspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
