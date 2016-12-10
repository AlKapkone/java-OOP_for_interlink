package com.company.orest_kapko;
// Static Polymorphism (compile time polymorphism/ Method overloading)
//The ability to execute different method implementations by altering the argument used with the method name is known as method overloading.
// In below program, we have three print methods each with different arguments.
// When you properly overload a method, you can call it providing different argument lists, and the appropriate version of the method executes.
class Overloadexample {
    //-------------------------------------------------------------------
    public void print(String s){
        System.out.println("First Method with only String- "+ s);
    }
    //-------------------------------------------------------------------
    public void print (int i){
        System.out.println("Second Method with only int- "+ i);
    }
    //-------------------------------------------------------------------
    public void print (String s, int i){
        System.out.println("Third Method with both- "+ s + "--" + i);
    }
    //-------------------------------------------------------------------
}

