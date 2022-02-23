package com.example.springpetclinicpractice.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class OwnerController {

    @GetMapping({"owners", "owners/index", "owners/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
