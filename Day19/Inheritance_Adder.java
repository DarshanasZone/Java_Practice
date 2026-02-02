
/*
Day 19: Java Inheritance II

Problem Statement:
Write the following classes:

1. A class named Arithmetic with a method add(int a, int b)
   that returns the sum of the two integers.

2. A class named Adder that inherits from the Arithmetic class.

You are NOT responsible for reading any input from stdin.
A locked code stub will test your submission by calling the add method
on an Adder object and passing it integer parameters.

You are NOT responsible for printing anything to stdout inside your classes.
The add method must simply return the sum of its parameters.

Sample Output:
My superclass is: Arithmetic
42 13 20
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // No extra methods needed
}


public class Inheritance_Adder{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
