package org.example.behavioral.state;

public class Client {

  public static void main(String[] args) {
    Order order = new Order();
    order.delivered();
    order.paymentSuccessful();

    order.cancel();
  }
}
