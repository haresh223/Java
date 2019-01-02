package com.basics.LogicOperators;

public class AndOR {

    public static void main(String[] args) {

        // String are immutable : once a string is created it cannot be changed

        String a = "example";
        System.out.println(a);
        a = "new example";
        System.out.println(a);

        String b = "example";

        StringBuilder sb = new StringBuilder();
        sb.append("example");
        System.out.println(sb);
        sb.append(" hello");
        System.out.println(sb);

        // 2 most widely used logical operators
        // 1. AND
        // 2. OR

        // AND returns true only when all inputs are true  &&
        // OR returns true when one of the input is true   ||

        String[] fruit = { "apple", "mango", "orange", "banana"};
        String[] fruits = { "apple","mangos", "oranges", "banana", "Grapes" };

        String s1 =  new String("apple");  // create a new object
        String s2 = new String("apple");

        String s3 = "apple";
        String s4 = "apple";

        String[] f1 = new String[2];
        f1[0] = new String("apple");
        String[] f2 = new String[2];
        f2[0] = new String("apple");


        /*if((fruit[0] == ("apple") || fruit[2].equals("oranges")) &&  fruit[1].equals("mango") ) {
            System.out.println("Its a fruit basket");
        } else System.out.println("oops");
*/
       // System.out.println(fruits[0].equals(fruit[0]) ); // true
        System.out.println(fruits[0] == fruit[0]);  //true
       // "s1 == s2 : : apple" ==  "apple";
/*
         System.out.println(" s1 == s2 : : " + ( s1 == s2));
         System.out.println("s1.equals(s2) : " + s1.equals(s2) );

        System.out.println(" s3 == s4 : : " + (s3 == s4));
        System.out.println("s3.equals(s4) : " +s3.equals(s4) );*/

        // System.out.println(f1[0].equals(f2[0]));
        System.out.println(f1[0] == f2[0]);  //false

    }

}


