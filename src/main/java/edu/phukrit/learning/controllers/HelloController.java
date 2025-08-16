package edu.phukrit.learning.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.phukrit.learning.dtos.Message;


/**
 * HelloController is a simple controller that handles requests to the "/api/hello" endpoint.
 * It returns a greeting message when accessed.
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Message sayHello() {
        return new Message("Hello, World!");
    }

    @PostMapping("/hello")
    public Message postHello(@RequestBody Message message) {
        return new Message("Received: " + message.getContent());
    }
}
