package com.company.orest_kapko;
// Static Polymorphism (compile time polymorphism/ Method overloading)

public class PolymDemo {

    public static void main(String[] args) {
       Overloadexample obj = new Overloadexample();
// We call three print methods each with different arguments.
        obj.print(10);
        obj.print("Amit");
        obj.print("Hello", 100);
    }
}
