package edu.phukrit.learning.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.phukrit.learning.dtos.MessageDto;


/**
 * HelloController is a simple controller that handles requests to the "/api/hello" endpoint.
 * It returns a greeting MessageDto when accessed.
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public MessageDto sayHello() {
        return new MessageDto("Hello, World!");
    }

    @PostMapping("/hello")
    public MessageDto postHello(@RequestBody MessageDto message) {
        return new MessageDto("Received: " + message.getContent());
    }
}
