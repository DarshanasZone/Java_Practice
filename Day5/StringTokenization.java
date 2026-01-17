
import java.io.*;
import java.util.*;

public class StringTokenization{

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Remove leading/trailing spaces
        s = s.trim();

        // If string is empty after trimming
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        // Split using non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");

        // Print number of tokens
        System.out.println(tokens.length);

        // Print each token
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

/*
Problem Statement:
------------------
Given a string consisting of English alphabetic letters and the following special characters:
(space), ! , , ? . _ ' @

Split the string into tokens such that:
- A token is one or more consecutive English alphabetic characters (A–Z or a–z).
- Special characters and spaces act as separators.

Tasks:
1. Split the string using appropriate delimiters.
2. Print the total number of tokens.
3. Print each token on a new line in the order they appear.

Input Format:
-------------
A single line string.

Output Format:
--------------
- First line: an integer representing the number of tokens.
- Next lines: each token printed on a new line.

Example:
--------
Input:
He is a very very good boy, isn't he?

Output:
10
He
is
a
very
very
good
boy
isn
t
he
*/
