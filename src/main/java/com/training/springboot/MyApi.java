package com.training.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyController {
    @GetMapping(value = "/name")
    public String getName() {
        return "Sowbhagya T";
    }
    @GetMapping(value = "/name/{dance}")
    public String getHobby(@PathVariable("dance") String dance){
        return "My hobby is "+dance;
    }
}