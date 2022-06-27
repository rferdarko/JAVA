package com.example.RestServiceDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  // makes this a Rest Controller and imports dependency

public class HelloWorldController {

    @RequestMapping (method = RequestMethod.GET, path = "/hello")
    // to make it callable from a browser the request method needs to be mapped to a path for a given address
    public String helloWorld() {  // public access method called helloWorld will return a String
        return "Hello World";  // return value
    }



}
