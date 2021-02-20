package com.example.rabbit.repository;

import com.example.rabbit.model.Rabbit;
import org.springframework.data.repository.CrudRepository;


public interface RabbitRepository extends CrudRepository<Rabbit, Long> {
}
