package com.demo.splunk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home controller
 */
@Slf4j
@RestController
public class HomeController {

    @GetMapping(value = "/{message}")
    public String home(@PathVariable String message){
        log.info(message);
        return message;
    }
}
