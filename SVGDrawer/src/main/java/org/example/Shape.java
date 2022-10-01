package org.example;

import lombok.ToString;
import org.springframework.context.annotation.Bean;

@ToString

public class Shape {
    String hexRGB;

    int size;

    int shape;

    public Shape(int num) {
        setHexRGB(num);
        setShape(num);
        setSize(num);
    }

    private void setHexRGB(int num) {
        int rgb = (num) >> 7;
        int r =  (num >> 16) % 255;
        int g = (num >> 8) & 255;
        int b = num & 255;
        this.hexRGB = String.format("rgb(%d, %d, %d)", r,g,b);
    }

    private void setSize(int num) {
        this.size = num & 3;
    }

    private void setShape(int num) {
        this.shape = (num >> 3) & 3;
    }

    public String getHexRGB() {
        return hexRGB;
    }

    public int getSize() {
        return size;
    }

    public int getShape() {
        return shape;
    }
}
