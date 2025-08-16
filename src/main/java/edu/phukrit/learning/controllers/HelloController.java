package edu.phukrit.learning.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.phukrit.learning.dtos.Message;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloController is a simple controller that handles requests to the "/api/hello" endpoint.
 * It returns a greeting message when accessed.
 */

@RestController
@RequestMapping("/api/")
public class HelloController {

    @GetMapping("/hello")
    public Message sayHello() {
        return new Message("Hello, World!");
    }
}
