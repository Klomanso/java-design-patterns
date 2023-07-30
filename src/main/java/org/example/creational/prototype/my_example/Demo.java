package org.example.creational.prototype.my_example;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle(10, 10, "red", 10);
        Shape rectangle = new Rectangle(10, 10, "green", 2, 3);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        for (int i = 0; i < 10; i++) {
            Shape copy = circle.clone();
            Shape copy_ = rectangle.clone();
            shapes.add(copy);
            shapes.add(copy_);
        }
    }
}
