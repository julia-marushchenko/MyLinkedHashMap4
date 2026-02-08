/**
 *  Java program to demonstrate LinkedHashMap.
 */

package com.mycollections;

import java.util.LinkedHashMap;

/**
 *  Main class.
 */
public class Main {

    // Main method to drive java program.
    public static void main(String[] args) {

        // Creating an empty LinkedHashMap.
        LinkedHashMap<Integer, String> myLhm = new LinkedHashMap<>();

        // Adding elements to myLhm.
        myLhm.put(3, "Muffin");
        myLhm.put(2, "Cake");
        myLhm.put(1, "Cookie");
        myLhm.put(4, "Pancake");

        // Printing mappings to console.
        System.out.println(myLhm); // Output: {3=Maffin, 2=Cake, 1=Cookie, 4=Puncake}

    }
}