//package com.basics.haresh.practice;
//public class TrafficLights {
////    public static void main(String args[]) {
//
////        String array[] = {"RED", "GREEN", "RED", "AMBER", "GREEN", "RED"};
////        for (String x : array) {
////            System.out.println(x);
////        }
//
//}
package com.basics.haresh.practice;

public class TrafficLights {
    public static void main(String args[]) throws  InterruptedException {

        int  color= 0;
        int i = 0;
        System.out.println(Thread.currentThread());
        // this will lopp 10 times
        while(i<10) {
            // reset the color back to red once it is amber
            if(color == 3) {
                color = 0;
            }
            switch(color) {
                default:
                    System.out.println("No such light");
                    break;
                case 0:
                    System.out.println("RED");
                    try {
                        Thread.sleep(5000);
                    }catch(InterruptedException e) {
                    }
                    break;
                case 1:
                    System.out.println("GREEN");
                    Thread.sleep(3000);
                    break;
                case 2:
                    System.out.println("AMBER");
                    Thread.sleep(2000);
                    break;

            }
            i++;
            color++;
        }

    }
}

