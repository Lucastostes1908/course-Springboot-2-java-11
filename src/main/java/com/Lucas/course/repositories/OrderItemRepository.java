package com.Lucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lucas.course.entities.OrderItem;
import com.Lucas.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}