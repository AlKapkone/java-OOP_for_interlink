package com.company;
public class Square extends Figure {
    private double storona;
    //--------------------------------------------------------------------------------------------------------------
    public Square(double storona) {
        super("Square");
        this.storona = storona;
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public double getSquare() {
        return storona * storona;
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public double getPerimeter() {
        return 4 * storona;
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return getName()+ ": Фігура з найбільшою площею це квадрат зі стороною = " + storona;
    }
}

