/*
Day 12 – 2D Array Hourglass Sum
Given a 6x6 2D array, an hourglass is defined as:

a b c
  d
e f g
The task is to calculate the sum of all possible hourglasses in the array
and print the maximum hourglass sum.

Input:
- Exactly 6 lines, each containing 6 space-separated integers.
- Each integer lies between -9 and 9.

Output:
- Print a single integer representing the maximum hourglass sum.

Example:
Input:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Output:
19
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class HourglassMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

       for (int i = 0; i < 6; i++) {
            String[] row = bufferedReader.readLine().trim().split(" ");
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                temp.add(Integer.parseInt(row[j]));
            }
            arr.add(temp);
        }

        int maxSum = Integer.MIN_VALUE;

        // Calculate hourglass sums
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                int sum =
                        arr.get(i).get(j) +
                        arr.get(i).get(j + 1) +
                        arr.get(i).get(j + 2) +
                        arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) +
                        arr.get(i + 2).get(j + 1) +
                        arr.get(i + 2).get(j + 2);

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
        bufferedReader.close();
    }
}