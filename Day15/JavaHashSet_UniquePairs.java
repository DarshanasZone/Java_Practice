/*
Problem Name: Java HashSet - Unique Pairs

Problem Statement:
In computer science, a set is an abstract data type that can store certain values
without any particular order and without repeated values.

You are given N pairs of strings. Two pairs (a, b) and (c, d) are identical if:
a = c AND b = d

Note:
(a, b) is NOT the same as (b, a)

After taking each pair as input, print the number of unique pairs
present so far.

Input Format:
- First line contains integer N (number of pairs)
- Next N lines contain two strings separated by space

Output Format:
- Print N lines
- On the i-th line, print the number of unique pairs after i inputs

Sample Input:
5
john tom
john mary
john tom
mary anna
mary anna

Sample Output:
1
2
2
3
3
*/



import java.io.*;
import java.util.*;

public class JavaHashSet_UniquePairs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String pair = pair_left[i] + " " + pair_right[i];
            set.add(pair);
            System.out.println(set.size());
        }

        s.close();
    }
}
