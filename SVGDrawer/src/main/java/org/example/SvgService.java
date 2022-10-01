package org.example;

import org.springframework.stereotype.Service;

@Service
public class SvgService {
    private static Shape shape;



    public static Shape getShapeByNumber(int num) {
        shape = new Shape(num);
        return shape;
    }
}
