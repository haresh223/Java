package com.basics.haresh.practice;

public class Car {

    private String model;
    private String type;
    private double year;
    private String colour;

    // method
    public void carDetails() {
        model = "BMW";
        type = "Sedan";
        year = 2014;
        colour = "White";

        System.out.println("Model of the car is: "+ model);
        System.out.println("Type of car is:      "+ type);
        System.out.println("year of the car is:  "+ year);
        System.out.println("Colour of car is:    "+ colour);
    }

    //Main method
    public static void main(String[] args) {
        Car  c = new Car();        // Create a new object and c(object veriabe name) and  custome made data type is Car , object name and class shoud be same, new car contains model, tyoe, year, colour
        c.carDetails();
    }
}
