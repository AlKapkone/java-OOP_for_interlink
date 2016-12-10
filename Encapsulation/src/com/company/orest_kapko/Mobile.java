package com.company.orest_kapko;
//Encapsulation means putting together all the variables (instance variables) and the methods into a single unit called Class.
//Programmers sometimes refer to encapsulation as using a “black box,” or a device that you can use without regard to the internal mechanisms.
//A programmer can access and use the methods and data contained in the black box but cannot change them.

/*
Below example shows Mobile class with properties, which can be set once while creating object using constructor arguments.
Properties can be accessed using getXXX() methods which are having public access modifiers.
 */
public class Mobile {
//-------------------------------------------------------------
    private String manufacturer;
    private String operating_system;
    public String model;
    private int cost;
    //Constructor to set properties/characteristics of object
//------------------------------------------------------------
    public Mobile(String man, String o,String m, int c){
        this.manufacturer = man;
        this.operating_system = o;
        this.model = m;
        this.cost = c;
    }
//------------------------------------------------------------
    //Method to get access Model property of Object
    public String getModel(){
        return this.model;
    }
    // We can add other method to get access to other properties
}
