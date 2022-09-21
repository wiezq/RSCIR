package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SvgController {

    @GetMapping
    public String index(){
        return "Hi im inside SVGController";
    }
    @GetMapping("/abc")
    public String index2(){
        return "index 2";
    }
}
