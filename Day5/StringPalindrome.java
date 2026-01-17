
/* 
Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

 A will consist at most 50 lower case english letters.

 Sample Input :
madam

Sample Output :
Yes

*/

import java.io.*;
import java.util.*;

public class StringPalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n= A.length();
        String s="";
        
        for(int i=n-1; i>=0; i--)
        {
            // System.out.println(A.charAt(i));
             s = s + A.charAt(i);
            // System.out.print(new1);
            // String new1=s+i;
        }
        if(A.equals(s))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}


