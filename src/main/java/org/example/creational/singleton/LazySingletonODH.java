package org.example.creational.singleton;

public final class LazySingletonODH {

  private LazySingletonODH() {
    System.out.println("shsd");
  }

  public static LazySingletonODH getInstance() {
    return RegistryHolder.INSTANCE;
  }

  private static class RegistryHolder {
    static LazySingletonODH INSTANCE = new LazySingletonODH();
  }
}
