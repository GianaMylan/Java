package com.example.firstdatabaseconnection.service;
import com.example.firstdatabaseconnection.model.Doges;
import org.springframework.http.HttpStatus;

public interface DogeService {

    Iterable<Doges> getDoges();
    Doges findDogeById(Long id);
    Doges createDoge(Doges doge);
    Doges updateDoge(Doges doge);
    HttpStatus deleteDoge(Long id);
}
