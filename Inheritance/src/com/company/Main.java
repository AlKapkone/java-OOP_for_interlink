package com.company;
import java.util.Arrays;
public class Main {
    //-----------------------------------------------------------------------------
//    public static Figure maxSquare(Figure[] fs){
//        Figure maxf = fs[0];
//        for(int i = 1; i < fs.length; ++i){
//            if(fs[i].getSquare() > maxf.getSquare()){
//                maxf = fs[i];
//            }
//        }
//        return maxf;
//    }
    //-----------------------------------------------------------------------------
    /*
    public static Figure[] sortBySquare(Figure[] fs) {
      Figure[] newmas = new Figure[fs.length];
      for(int i = 1; i < fs.length; ++i){
       if(fs[i].getSquare() > maxf.getSquare()){
        maxf = fs[i];
       }
      }
     return null;
    }
    */
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        Figure[] figs = {new Circle(2), new Triangle(3,6,5),
                new Square(4), new Trapeze(2, 3, 4)};

        System.out.println(Arrays.deepToString(figs));

//        Figure max = maxSquare(figs);
//        System.out.println(max);

            /*Figure[] sortf = sortBySquare(figs);
       System.out.println(Arrays.deepToString(sortf));
             */
//-----------------------------------------------------------------------------
      Figure f2 = new Triangle(3, 4, 5);
      System.out.println("Площа трикутника становить " + f2.getSquare());
      System.out.println("Периметр трикутника становить " + f2.getPerimeter());

      Figure f3 = new Square(8);
      System.out.println("Площа квадрата становить " + f3.getSquare());
      System.out.println("Периметр квадрата становить " + f3.getPerimeter());

      Figure f4 = new Circle(6);
      System.out.println("Площа кола становить " + f4.getSquare());
      System.out.println("Периметр кола становить " + f4.getPerimeter());

      Figure f5 = new Trapeze(6, 3, 6);
      System.out.println("Площа трапеції становить " + f5.getSquare());
      System.out.println("Периметр трапеції становить " + f5.getPerimeter());
//-----------------------------------------------------------------------------
    }
}
