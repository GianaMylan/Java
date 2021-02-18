package com.example.firstserver.controller;

import com.example.firstserver.service.CatService;
import com.example.firstserver.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cats")

public class CatController {
    @Autowired
    CatService catService;

    @GetMapping
    public Cat getCat() {
        return catService.getCat();
    }
}
