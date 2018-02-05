package com.gad.spring.play.service;

import org.springframework.stereotype.Component;

@Component
public interface PlayFactory {

    PlaygroundService getPlayGround(String type);
}
