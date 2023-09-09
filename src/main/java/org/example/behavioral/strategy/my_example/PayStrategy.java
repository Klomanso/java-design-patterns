package org.example.behavioral.strategy.my_example;

/** Common interface for all strategies. */
public interface PayStrategy {
  boolean pay(int paymentAmount);

  void collectPaymentDetails();
}
