package com.basics.haresh.practice;

public class Car {

    private String model;
    private String type;
    private double year;
    private String colour;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    // method
    public void carDetails() {
        System.out.println("Model of the car is: "+ model);
        System.out.println("Type of car is     : "+ type);
        System.out.println("year of the car is : "+ year);
        System.out.println("Colour of car is     "+ colour);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }

    public Car(String model, String type, double year, String colour) {
        this.model = model;
        this.type = type;
        this.year = year;
        this.colour = colour;
    }

    //default constructor
    public Car() {
    }
}

