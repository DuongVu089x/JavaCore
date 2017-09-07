package com.dav.javacore.oop;

import com.dav.javacore.oop.extendsdemo.Rectangle;
import com.dav.javacore.oop.extendsdemo.Square;

public class Test {

    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle();
       rectangle.setWidth(10.0);
       rectangle.setHeight(12.0);

       System.out.println("Rectangle Perimeter: "+ rectangle.perimeter() + " Acreage: " + rectangle.acreage());

       Square square = new Square();
       square.setWidth(10);

       System.out.println("Square Perimeter: " + square.perimeter() + " Acreage: " + square.acreage());
    }

}
