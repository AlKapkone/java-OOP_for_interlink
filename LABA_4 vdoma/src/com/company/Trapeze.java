package com.company;
public class Trapeze extends Figure {
    private double up_storona;
    private double down_storona;
    private double vusota;
    //--------------------------------------------------------------------------------------------------------------
    public Trapeze(double up_storona, double down_storona, double vusota) {
        super("Trapeze");
        this.up_storona = up_storona;
        this.down_storona = down_storona;
        this.vusota = vusota;
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public double getSquare() {
        return ((up_storona * down_storona) / 2) * vusota;
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public double getPerimeter() {
        return 2 * (up_storona + down_storona);
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return getName() + ": Фігура з найбільшою площею це трапеція з параметрами = " + up_storona + down_storona + vusota;
    }
}

