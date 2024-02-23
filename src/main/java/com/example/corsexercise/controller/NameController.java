package com.example.corsexercise.controller;

import com.example.corsexercise.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1")
public class NameController {
    @Autowired
    private NameService nameService;

    @GetMapping("/name")
    public String returnName(@RequestParam String name) {
        return nameService.returnName(name);
    }

    @PostMapping("invert")
    public StringBuilder invertName(@RequestParam String name) {
        return nameService.invertName(name);
    }
}
