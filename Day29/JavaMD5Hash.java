/*
Day 29 - Problem 2: Java MD5

Problem:
MD5 (Message-Digest Algorithm 5) is a widely-used cryptographic hash function.
Given an alphanumeric string, compute and print its MD5 hash value.

Input:
A single alphanumeric string.

Output:
Print the MD5 encryption value of the string.

Example:
Input:  HelloWorld
Output: 68e109f0f40ca72a15e05cc22786f8e6
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class JavaMD5Hash  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] digest = md.digest();

            StringBuilder hex = new StringBuilder();
            for (byte b : digest) {
                hex.append(String.format("%02x", b));
            }

            System.out.println(hex.toString());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}