package com.basics.haresh.practice;

public class TrafficLights {
        public static void main(String args[]){

            String color="RED";
            switch(color) {
                case "Green":
                    System.out.println("You can go in green");
                    break;
                case "Yellow":
                    System.out.println("You need to slowdown");
                    break;
                case "RED":
                    System.out.println("You must stop at RED signal");
                    break;
                default:
                    System.out.println("No signal installed");
                    break;
            }
        }
    }


//    RED
// GREEN
//            AMBER
//RED
//                    GrEEN
//AMBER