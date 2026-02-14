/*
Day31 - Java HashSet Unique Pairs

Problem:
A set stores values without duplicates.
You are given N pairs of strings.
Two pairs (a,b) and (c,d) are identical if a=c and b=d.
After reading each pair, print the number of UNIQUE pairs so far.

Example:
Input:
5
john tom
john mary
john tom
mary anna
mary anna

Output:
1
2
2
3
3
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashSetUniquePairs{

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
Set<String> set = new HashSet<>();

for (int i = 0; i < t; i++) {
    set.add(pair_left[i] + "#" + pair_right[i]);
    System.out.println(set.size());
}


    }
}