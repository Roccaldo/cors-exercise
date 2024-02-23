package com.example.corsexercise.services;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    public String returnName(String name) {
        return name;
    }

    public StringBuilder invertName(String name) {
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        return sb;
    }
}
