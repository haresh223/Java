package com.basics.arrays;

public class ArrayExample {

    public static void main(String[] args) {


        int[] number = {10, 11, 12};

        String[] names  = new String[9];
        names[0] = "abc";
        System.out.println(names[0]);
        System.out.println(names[1]);

        String[] ename  = { "abc", "xyz", "def"};
        System.out.println(ename[1]);
        ename[1] = "sfljsfljsfldsfjs";   // To change the particular value in array

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println("Length of Number Array " + number.length);

        try {
            System.out.println(number[3]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Hey I caught this exception");
            System.out.println(e.getMessage());

        }

        for(int j = 0; j < number.length; j++ ) {
            System.out.println(number[j]);
        }

        // Enhanced for loop
        for(String s : names) {
            System.out.println(s);
        }
    }
}


