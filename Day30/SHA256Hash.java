/*
Day30 - Problem 1: Java SHA-256 Hash

Given an alphanumeric string, print its SHA-256 encryption value.

Input:
A single alphanumeric string.

Output:
Print SHA-256 hash of the string.

Example:
Input: HelloWorld
Output: 872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4
*/





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;


public class SHA256Hash{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(input.getBytes());
            byte[] digest = md.digest();

            // Convert byte array into hexadecimal string
            StringBuilder hex = new StringBuilder();
            for (byte b : digest) {
                hex.append(String.format("%02x", b));
            }

            System.out.println(hex.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}