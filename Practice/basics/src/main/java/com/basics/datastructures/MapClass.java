package com.basics.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    // Map is a key value pair
    // A key is a unique value
    // A map key can have 1 null value
    public static void main(String[] args) {
//      Map<Integer,String> employeeMap = new HashMap<>();
        Map<Integer,String> employeeMap = new TreeMap<>(); // It's for sorted way
        employeeMap.put(100,"XYZ");
        employeeMap.put(200,"ABc");
        employeeMap.put(300,"XYZ");
        System.out.println("MY employee map :" + employeeMap);
        employeeMap.put(100,"CDEF");
        employeeMap.put(null,"ABC");
        System.out.println("MY employee map :" + employeeMap);
        System.out.println("MY employee map keys :" + employeeMap.keySet());
    }
}
