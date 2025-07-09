package com.joaodev.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.projectspring.entities.OrderItem;
import com.joaodev.projectspring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
