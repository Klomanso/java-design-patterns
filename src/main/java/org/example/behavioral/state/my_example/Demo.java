package org.example.behavioral.state.my_example;

/** Demo class. Everything comes together here. */
public class Demo {
  public static void main(String[] args) {
    Player player = new Player();
    UI ui = new UI(player);
    ui.init();
  }
}
