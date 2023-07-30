package org.example.creational.prototype.my_example;

import java.util.Objects;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    protected Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    protected Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape shape2)) return false;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
