package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController{
    @GetMapping
    public String getName(){
        return "Antonio";
    }

    @PostMapping
    public String reverseName(){
        String name = "Antonio";
        StringBuilder reverseNamed = new StringBuilder(name).reverse();
        return reverseNamed.toString();
    }

}