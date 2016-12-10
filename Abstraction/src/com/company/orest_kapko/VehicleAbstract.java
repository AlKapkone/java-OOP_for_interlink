package com.company.orest_kapko;
//An abstract class is something which is incomplete and you can not create an instance of the abstract class.

//When I am creating a class called Vehicle, I know there should be methods like start() and stop()
// but don't know start and stop mechanism of every vehicle since they could have different start and stop mechanism
// e.g some can be started by a kick or some can be by pressing buttons.
public abstract class VehicleAbstract {
//---------------------------------------------------------------
    public abstract void start();
//---------------------------------------------------------------
    public void stop(){
        System.out.println("Stopping Vehicle in abstract class");
    }
}
//!!!Java has a concept of abstract classes, abstract method but a variable can not be abstract in Java.