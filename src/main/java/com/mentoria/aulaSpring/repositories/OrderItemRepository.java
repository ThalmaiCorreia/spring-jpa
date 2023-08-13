package com.mentoria.aulaSpring.repositories;

import com.mentoria.aulaSpring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
