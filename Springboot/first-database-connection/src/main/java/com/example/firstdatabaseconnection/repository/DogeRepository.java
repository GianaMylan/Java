package com.example.firstdatabaseconnection.repository;

import com.example.firstdatabaseconnection.model.Doges;
import org.springframework.data.repository.CrudRepository;

public interface DogeRepository extends CrudRepository<Doges, Long> {
}
