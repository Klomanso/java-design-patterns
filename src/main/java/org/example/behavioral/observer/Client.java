package org.example.behavioral.observer;

public class Client {

  public static void main(String[] args) {
    Order order = new Order("101");
    PriceObserver price = new PriceObserver();
    order.attach(price);

    QuantityObserver quant = new QuantityObserver();
    order.attach(quant);

    order.addItem(50);

    System.out.println(order);
  }
}
