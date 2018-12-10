package com.basics.haresh.practice;

public class CalculatorMain {
        public static void main(String[] args) {
            Calculator cal = new Calculator( 10, 10  );
            System.out.println(cal);
            System.out.println("A value is: "+ cal.getA());
            System.out.println("B value is: "+ cal.getB());
            double  c = cal.add();
            System.out.println(c);
            cal.setA(30);
            cal.setB(20);
            c = cal.sub();
            System.out.println(c);

        }
}


