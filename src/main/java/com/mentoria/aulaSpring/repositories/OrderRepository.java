package com.mentoria.aulaSpring.repositories;

import com.mentoria.aulaSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
