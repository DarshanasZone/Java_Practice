/*
Problem Statement:
------------------
Given two strings consisting of English alphabetic letters,
determine whether the two strings are anagrams of each other.
Two strings are called anagrams if they contain the same characters
with the same frequencies, but possibly in a different order.
The comparison should be case-insensitive.

Input:
------
Two strings a and b.

Output:
-------
Print "Anagrams" if the strings are anagrams.
Otherwise, print "Not Anagrams".

Example:
--------
Input:
anagram
margana

Output:
Anagrams
*/

import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        a=a.toLowerCase();
        b=b.toLowerCase();
        
         if(a.length() != b.length())
         {
            return false;
         }
            int[] freq = new int[26];
         
         for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}