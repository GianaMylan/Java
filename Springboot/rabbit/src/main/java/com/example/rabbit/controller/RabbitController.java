package com.example.rabbit.controller;


import com.example.rabbit.model.Rabbit;
import com.example.rabbit.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/rabbit")

public class RabbitController {
    @Autowired
    RabbitService rabbitService;

    @GetMapping
    public Iterable<Rabbit> getRabbit() {
        return rabbitService.getRabbits();
    }

    @GetMapping("/{id}")
    public Rabbit findRabbitById(@PathVariable Long rabbitId) {
        return rabbitService.findRabbitById(rabbitId);
    }

    @PostMapping
    public Rabbit createRabbit(@RequestBody Rabbit rabbit) {
        return rabbitService.createRabbit(rabbit);
    }

    @PatchMapping
    public Rabbit updateRabbit(@RequestBody Rabbit rabbit) {
        return rabbitService.updateRabbit(rabbit);
    }

    @DeleteMapping ("/{id}")
    public HttpStatus deleteRabbit(@PathVariable Long rabbitId) {
         return rabbitService.deleteRabbit(rabbitId);
    }
}
