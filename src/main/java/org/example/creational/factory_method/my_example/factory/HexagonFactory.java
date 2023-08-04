package org.example.creational.factory_method.my_example.factory;

import org.example.creational.factory_method.my_example.Hexagon;
import org.example.creational.factory_method.my_example.Shape;

public class HexagonFactory extends ShapeFactory {
  @Override
  protected Shape createShape() {
    return new Hexagon();
  }
}
