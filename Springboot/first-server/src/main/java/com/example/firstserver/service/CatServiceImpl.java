package com.example.firstserver.service;

import com.example.firstserver.model.Cat;
import org.springframework.stereotype.Service;

@Service
public class CatServiceImpl implements CatService {
    @Override
    public Cat getCat() {
        Cat jewel = new Cat("Jewel", "tortie", 12);
        //Cat salem = new Cat("Salem", "black", 20);
       // Cat crystal = new Cat("Crystal", "grey tabby", 21);
        return jewel;
        //return salem;
        //return crystal;
    }
}
