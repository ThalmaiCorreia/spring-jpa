package com.mentoria.aulaSpring.repositories;

import com.mentoria.aulaSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
