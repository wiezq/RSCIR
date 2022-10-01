package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SvgController {

    SvgService svgService;
    @Autowired
    public SvgController(SvgService svgService) {
        this.svgService = svgService;
    }

    @GetMapping("/drawer")
    public String index(Model model, @RequestParam int num){
        Shape s = SvgService.getShapeByNumber(num);
        System.out.println(s);
        model.addAttribute("shape", s);
        return "index";
    }
}
