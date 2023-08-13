package org.example.creational.singleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton. Although this implementation solves the
 * multi-threading issue with lazy initialization using volatile and double check locking, the
 * volatile keyword is guaranteed to work only after JVMs starting with version 1.5 and later.
 */
public final class LazySingletonDCL {

  private static volatile LazySingletonDCL INSTANCE;

  private LazySingletonDCL() {}

  public static LazySingletonDCL getInstance() {
    if (INSTANCE == null) {
      synchronized (LazySingletonDCL.class) {
        if (INSTANCE == null) {
          INSTANCE = new LazySingletonDCL();
        }
      }
    }
    return INSTANCE;
  }
}
