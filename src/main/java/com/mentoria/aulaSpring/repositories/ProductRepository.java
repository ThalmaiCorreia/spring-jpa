package com.mentoria.aulaSpring.repositories;

import com.mentoria.aulaSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
