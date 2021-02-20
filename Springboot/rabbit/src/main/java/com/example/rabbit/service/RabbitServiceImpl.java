package com.example.rabbit.service;


import com.example.rabbit.model.Rabbit;
import com.example.rabbit.repository.RabbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class RabbitServiceImpl  implements RabbitService{

    @Autowired
    RabbitRepository rabbitRepository;

    @Override
    public Iterable<Rabbit> getRabbits() {
        return rabbitRepository.findAll();
    }

    @Override
    public Rabbit findRabbitById(Long rabbitId) {
        return rabbitRepository.findById(rabbitId).get();
    }

    @Override
    public Rabbit createRabbit(Rabbit rabbit) {
        return rabbitRepository.save(rabbit);
    }

    @Override
    public Rabbit updateRabbit(Rabbit rabbit) {
        return rabbitRepository.save(rabbit);
    }

    @Override
    public HttpStatus deleteRabbit(Long rabbitId) {
        rabbitRepository.deleteById(rabbitId);
        return HttpStatus.OK;
    }
}
