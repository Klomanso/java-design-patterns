package org.example.creational.singleton;

public final class LazySingletonODH {

  private LazySingletonODH() {
    System.out.println("shsd");
  }

  private static class RegistryHolder {
    static LazySingletonODH INSTANCE = new LazySingletonODH();
  }

  public static LazySingletonODH getInstance() {
    return RegistryHolder.INSTANCE;
  }
}
