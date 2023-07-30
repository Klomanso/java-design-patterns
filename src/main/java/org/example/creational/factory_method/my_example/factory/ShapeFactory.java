package org.example.creational.factory_method.my_example.factory;

import org.example.creational.factory_method.my_example.Shape;

public abstract class ShapeFactory {

    public Shape create() {
        Shape shape = createShape();
        shape.transform();
        return shape;
    }

    protected abstract Shape createShape();
}
