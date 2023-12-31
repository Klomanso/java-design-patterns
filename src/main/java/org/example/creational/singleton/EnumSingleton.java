package org.example.creational.singleton;

/**
 * (Ref. Google I/O 2k8 Joshua Bloch) Since Java 1.5 using enum is clean way to create a singleton.
 * It handles serialization using java's in-built mechanism and still ensure single instance
 */
public enum EnumSingleton {
  INSTANCE;

  public void someMethod() {
    // do actual work here
  }
}
