/* 
Given two strings of lowercase English letters,  A and ,B perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary).
Capitalize the first letter in A and B and print them on a single line, separated by a space.

Sample Input :
hello
java

Sample Output :
9
No
Hello Java
*/

import java.io.*;
import java.util.*;

public class StringOp{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
       String a= A.toLowerCase();
       String b= B.toLowerCase();
       
    
        int sum= a.length() + b.length();
      
        System.out.println(sum);
        
        if(a.compareTo(b) >0)
        {
        System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        String capA = a.substring(0,1).toUpperCase() + a.substring(1);
        String capB = b.substring(0,1).toUpperCase() + b.substring(1);
        
        System.out.println(capA + " " + capB);
    }
}



