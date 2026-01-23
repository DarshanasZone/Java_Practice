/*
Day 10 – BigInteger Operations

Problem Statement:
Given two very large non-negative integers A and B (up to 200 digits),
perform the following operations using Java's BigInteger class:

1. Print the sum of A and B.
2. Print the product of A and B.

Input:
Two lines, each containing a non-negative integer.

Output:
First line: A + B
Second line: A * B

Note:
- Do not print leading zeros.
- Standard primitive data types cannot be used due to size constraints.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class BigIntegerOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());

        // Addition
        System.out.println(a.add(b));

        // Multiplication
        System.out.println(a.multiply(b));

        sc.close();
    }
}