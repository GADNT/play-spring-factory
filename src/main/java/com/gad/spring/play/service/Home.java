package com.gad.spring.play.service;

import org.springframework.stereotype.Component;

@Component(value = "hg")
public class Home implements PlaygroundService {
    @Override
    public String play(String name) {
        return name + " playing home";
    }
}
