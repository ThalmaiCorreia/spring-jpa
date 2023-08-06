package com.mentoria.aulaSpring.repositories;

import com.mentoria.aulaSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
