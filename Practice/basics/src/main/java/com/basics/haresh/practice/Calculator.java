package com.basics.haresh.practice;

public class Calculator {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add() {
        final double c = a + b;
        return c;
    }

    public double sub() {
        final double c = a - b;
        return c;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public Calculator(double  a, double b ){
        this.a = a;
        this.b = b;
    }

    public Calculator () {

    }
}
