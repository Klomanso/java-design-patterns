package org.example.behavioral.visitor.my_example;

public interface Shape {
  void move(int x, int y);

  void draw();

  String accept(Visitor visitor);
}
