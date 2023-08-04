package org.example.creational.factory_method;

import org.example.creational.factory_method.my_example.Shape;
import org.example.creational.factory_method.my_example.factory.HexagonFactory;
import org.example.creational.factory_method.my_example.factory.PentagonFactory;
import org.example.creational.factory_method.my_example.factory.ShapeFactory;

public class Client {

  public static void main(String[] args) {
    actionWithShape(new PentagonFactory());
    actionWithShape(new HexagonFactory());
  }

  public static void actionWithShape(ShapeFactory factory) {
    Shape shape = factory.create();
  }
}
