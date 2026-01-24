/*
Day 11 – Array Initialization and Element Storage

Problem Statement:
Given an integer N representing the size of an array, read N integers from input
and store them in an integer array. Each input value should be stored at its
corresponding index in the array. The program should then print all elements
of the array in order.

This problem helps understand:
- Array creation in Java
- Storing values using indices
- Accessing array elements sequentially
*/


import java.util.*;

public class ArrayInitialization{


    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
   // 1. Create array of size n
        int[] a = new int[n];

  // 2. Store values in array
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }


        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}