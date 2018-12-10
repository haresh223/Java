package com.basics.haresh.practice;

public class CarMain {
    public static void main(String[] args) {
        Car c = new Car();        // Create a new object and c(object veriabe name) and  custome made data type is Car , object name and class shoud be same, new car contains model, tyoe, year, colour
        c.setModel("BMW");
        c.setType("Sedan");
        c.setYear(2014);
        c.setColour("White");
        c.carDetails();

        Car c1 = new Car();
        c1.carDetails();
        System.out.println(c1);
        Car c2 = new Car("Benz", "sedan", 2010, "white");
        System.out.println(c2);
    }
}
