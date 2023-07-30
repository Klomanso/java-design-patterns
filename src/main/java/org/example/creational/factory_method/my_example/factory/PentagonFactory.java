package org.example.creational.factory_method.my_example.factory;

import org.example.creational.factory_method.my_example.Pentagon;
import org.example.creational.factory_method.my_example.Shape;

public class PentagonFactory extends ShapeFactory {
    @Override
    protected Shape createShape() {
        return new Pentagon();
    }
}
