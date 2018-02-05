package com.gad.spring.play.service;

import org.springframework.stereotype.Component;

@Component(value = "sp")
public class School implements PlaygroundService{
    @Override
    public String play(String name) {
        return name + " playing school";
    }
}
