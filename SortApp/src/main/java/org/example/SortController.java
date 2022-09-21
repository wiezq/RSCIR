package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortController {

    @GetMapping
    public String index(){
        return "Hi im inside SortController";
    }
}
