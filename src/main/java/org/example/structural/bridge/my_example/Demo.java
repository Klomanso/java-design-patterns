package org.example.structural.bridge.my_example;

public class Demo {
  public static void main(String[] args) {
    testDevice(new TV());
    testDevice(new Radio());
  }

  public static void testDevice(Device device) {
    System.out.println("Test with basic remote.");
    BasicRemote basicRemote = new BasicRemote(device);
    basicRemote.power();
    device.printStatus();

    System.out.println("Test with advanced remote.");
    AdvancedRemote advancedRemote = new AdvancedRemote(device);
    advancedRemote.power();
    advancedRemote.mute();
    device.printStatus();
  }
}
