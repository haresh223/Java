package com.interfaces;

public class ShapeMain {

    public static void main(String[] args) {

        Square s = new Square();
        s.drawShape();

        Circle c = new Circle();
        c.drawShape();

//Shape s = new Shape();

        Shape shape = new Square();
        shape.drawShape();
        shape = new Circle();
        shape.drawShape();
    }
}
