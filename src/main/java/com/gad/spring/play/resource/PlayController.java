package com.gad.spring.play.resource;

import com.gad.spring.play.service.PlayFactory;
import com.gad.spring.play.service.PlaygroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/play")
public class PlayController {

    @Autowired
    PlayFactory playFactory;

    @GetMapping(value = "/{name}/{type}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getPlay(@PathVariable(value = "name") String name, @PathVariable(value = "type") String type){

        PlaygroundService playGround = playFactory.getPlayGround(type);


        return  new ResponseEntity<>(playGround.play(name), HttpStatus.OK);
    }
}
