
/*
Day 13 – Java ArrayList (Dynamic Array Queries)

Problem Statement:
Sometimes it's better to use dynamic-sized arrays. Java's ArrayList provides this feature.

You are given N lines. Each line contains a number D followed by D space-separated integers.
After that, Q queries are given. Each query consists of two integers X and Y.

For each query, print the element present at position Y in line X.
If the position does not exist, print "ERROR!".

Input Format:
- The first line contains an integer N.
- The next N lines contain an integer D followed by D integers.
- The next line contains an integer Q.
- The following Q lines contain two integers X and Y.

Output Format:
- Print the element at position Y of line X.
- If not present, print "ERROR!".

Approach:
- Store the input using ArrayList<ArrayList<Integer>>.
- Handle invalid indexes using try-catch.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DyanamicArrayQueries {
    
      public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of lines
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Reading lines
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // number of elements in this line
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            list.add(row);
        }

        int q = sc.nextInt(); // number of queries

        // Processing queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}