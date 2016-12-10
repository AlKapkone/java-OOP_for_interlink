package com.company.orest_kapko;
//Dynamic Polymorphism (run time polymorphism/ Method Overriding)
//When you create a subclass by extending an existing class, the new subclass contains data and methods that were defined in the original superclass.
//In other words, any child class object has all the attributes of its parent.
public class OverridingDemo {
    public static void main(String[] args) {
        //Creating Object of SuperClass and calling getModel Method
        Mobile m = new Mobile("Nokia", "Win8", "Lumia",10000);
        System.out.println(m.getModel());
        //Creating Object of Sublcass and calling getModel Method
        Android a = new Android("Samsung", "Android", "Grand",30000);
        System.out.println(a.getModel());
        //Creating Object of Sublcass and calling getModel Method
        Blackberry b = new Blackberry("BlackB", "RIM", "Curve",20000);
        System.out.println(b.getModel());
    }
}