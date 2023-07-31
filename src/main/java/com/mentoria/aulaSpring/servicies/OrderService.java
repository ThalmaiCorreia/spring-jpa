package com.mentoria.aulaSpring.servicies;

import com.mentoria.aulaSpring.entities.Order;
import com.mentoria.aulaSpring.entities.User;
import com.mentoria.aulaSpring.repositories.OrderRepository;
import com.mentoria.aulaSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
