package org.example.structural.adapter.my_example;

public class Demo {
  public static void main(String[] args) {
    RoundHole roundHole = new RoundHole(2);
    RoundPeg roundPeg = new RoundPeg(2);
    System.out.println(roundHole.fits(roundPeg));
    SquarePeg squarePeg = new SquarePeg(3);
    SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
    System.out.println(roundHole.fits(squarePegAdapter));
  }
}
