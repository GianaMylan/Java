package com.example.firstdatabaseconnection.service;

import com.example.firstdatabaseconnection.model.Doges;
import com.example.firstdatabaseconnection.repository.DogeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;

@Service // this is a bean
public class DogesServiceImpl implements DogeService {
    @Autowired
    DogeRepository dogeRepository;

    @Override
    public Iterable<Doges> getDoges() {
        return dogeRepository.findAll();
    }

    @Override
    public Doges findDogeById(Long id) {
        return dogeRepository.findById(id).get();
    }

    @Override
    public Doges createDoge(Doges doge) {
        return dogeRepository.save(doge);
    }

    @Override
    public Doges updateDoge(Doges doge) {
        return dogeRepository.save(doge);
    }

    @Override
    public HttpStatus deleteDoge(Long id) {
        dogeRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
