package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinuxConsoleController {


    @GetMapping
    public String index(){
        return "Hi im inside linux console controller";
    }
}
