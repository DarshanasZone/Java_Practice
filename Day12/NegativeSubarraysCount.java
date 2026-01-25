
/*
Day 13 – Count Negative Subarrays

A subarray is a contiguous block of elements from an array.
The sum of a subarray is the total of its elements.

Task:
Given an array of integers, count how many subarrays have a negative sum.

Input:
- An integer N representing the array length
- N space-separated integers

Output:
- Print the number of subarrays whose sum is negative

Example:
Input:
5
1 -2 4 -5 1

Output:
9
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NegativeSubarraysCount {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}