package com.example.firstdatabaseconnection.controller;
import com.example.firstdatabaseconnection.model.Doges;
import com.example.firstdatabaseconnection.service.DogeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doges")
// http://localhost:8080/doges

public class DogeController {
    @Autowired
    DogeService dogeService;

    @GetMapping
    public Iterable<Doges> getDoges() {
        return dogeService.getDoges();
    }

    @GetMapping("/{id}") // http://localhost:8080/doges/:id
    public Doges getDogeById(@PathVariable Long id) {
        return dogeService.findDogeById(id);
    }

    @PostMapping
    public Doges createDoge(@RequestBody Doges doge) {
        return dogeService.createDoge(doge);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteDogeById(@PathVariable Long id) {
        return dogeService.deleteDoge(id);
    }

    @PatchMapping
    public Doges updateDoge(@RequestBody Doges doge) {
        return dogeService.updateDoge(doge);
    }// error 405 must fix
}
