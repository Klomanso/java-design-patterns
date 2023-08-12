package org.example.structural.adapter.my_example;

public class SquarePegAdapter extends RoundPeg {
    SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        // need to calculate circle radius, which fit this peg
        return (Math.sqrt(Math.pow(squarePeg.getWidth() / 2, 2) * 2));
    }
}
