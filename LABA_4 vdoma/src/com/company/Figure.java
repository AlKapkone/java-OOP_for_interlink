package com.company;

abstract class Figure {
    private String name;
    public abstract double getSquare();
    public abstract double getPerimeter();
    //--------------------------------------------------------------------------------------------------------------
    public Figure(String name) {
        this.name = name;
    }
    //--------------------------------------------------------------------------------------------------------------
    public String getName(){
        return name;
    }
}
