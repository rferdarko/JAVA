package com.example.RestServiceDemo;

import org.springframework.web.bind.annotation.*;

@RestController

// This program takes a name at the end of the url and concats the new string output to the browser

public class HelloWorldName {
    @RequestMapping(method = RequestMethod.GET, path = "/hello/{name}")
    public String helloWorld(@PathVariable String name) {
        return String.format("Hello %s", name);

        // URL localhost:8080/Hello/<name>
    }


}
