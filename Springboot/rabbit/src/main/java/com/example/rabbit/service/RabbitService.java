package com.example.rabbit.service;

import com.example.rabbit.model.Rabbit;
import org.springframework.http.HttpStatus;

public interface RabbitService {

    Iterable<Rabbit> getRabbits();
    Rabbit findRabbitById(Long rabbitId);
    Rabbit createRabbit(Rabbit rabbit);
    Rabbit updateRabbit(Rabbit rabbit);
    HttpStatus deleteRabbit(Long rabbitId);

}
