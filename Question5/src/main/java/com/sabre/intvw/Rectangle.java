package com.sabre.intvw;

public class Rectangle implements Shape{
    int side1;
    int side2;
    public Rectangle(int side1, int side2) {
        this.side1=side1;
        this.side2=side2;
    }

    public double area() {
        return this.side1*this.side2;
    }
}
