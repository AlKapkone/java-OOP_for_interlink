package com.company;
public class Circle extends Figure {
    private double radius;
    //--------------------------------------------------------------------------------------------------------------
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public double getPerimeter() {
        return  2 * Math.PI * radius;
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return getName()+ ": Фігура з найбільшою площею це коло з радіусом = " + radius;
    }

}
