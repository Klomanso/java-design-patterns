package org.example.creational.singleton;

public final class EagerSingleton {

  private EagerSingleton() {}

  public static final EagerSingleton INSTANCE = new EagerSingleton();

  public static EagerSingleton getInstance() {
    return INSTANCE;
  }
}
