package com.company;
public class Triangle extends Figure{
    protected double a;
    protected double b;
    protected double c;
    //--------------------------------------------------------------------------------------------------------------
    public Triangle(double a, double b, double c) {
        super("Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
        if( ( (a + b ) <= c ) || ((a + c ) <= b ) ||((c + b ) <= a ) )
        {
            System.out.println("Помилка, введіть інші величини сторони");
        }
        else{
            System.out.println("Сторони трикутника введено правильно");
        }
    }
    //--------------------------------------------------------------------------------------------------------------
    private  double halfPer() {
        return (this.a + this.b + this.c)/2;
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public double getSquare() {
        double aa = halfPer();
        return Math.sqrt( aa * (aa - a) * (aa - b) * (aa - c));
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public double getPerimeter() {
        return (this.a + this.b + this.c);
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return getName()+ ": Фігура з найбільшою площею це трикутник зі сторонами = " + a + b +c;
    }
}

