/*
HackerRank – Java BitSet

Problem Statement:
Java's BitSet class implements a vector of bits that grows as needed.
Each bit can have a value of either 0 (false) or 1 (true). A bit with
value 1 is called a set bit.

You are given two BitSets, B1 and B2, each of size N, where all bits
are initially set to 0. You must perform M operations on these BitSets.

The operations can be:
- AND x y
- OR x y
- XOR x y
- FLIP x i
- SET x i

Where:
- x is either 1 or 2 (representing BitSet B1 or B2)
- y is the other BitSet
- i is the index of the bit to modify

After each operation, print the number of set bits in BitSet B1 and
BitSet B2 as two space-separated integers on a new line.

Input Format:
- First line contains two integers N and M
- Next M lines contain operations

Output Format:
- After each operation, print the count of set bits in B1 and B2

Concepts Used:
- Java BitSet
- Bitwise operations
- Java input handling
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBitSetOperations  {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String operation = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            BitSet first = (x == 1) ? b1 : b2;
            BitSet second = (y == 1) ? b1 : b2;

            switch (operation) {
                case "AND":
                    first.and(second);
                    break;
                case "OR":
                    first.or(second);
                    break;
                case "XOR":
                    first.xor(second);
                    break;
                case "FLIP":
                    first.flip(y);
                    break;
                case "SET":
                    first.set(y);
                    break;
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}