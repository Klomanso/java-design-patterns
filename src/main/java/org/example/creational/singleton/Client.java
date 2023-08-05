package org.example.creational.singleton;

public class Client {
  public static void main(String[] args) {
    LazySingletonODH singleton1;
    singleton1 = LazySingletonODH.getInstance();
  }
}
