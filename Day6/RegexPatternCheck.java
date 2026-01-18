
import java.util.Scanner;
import java.util.regex.*;

public class RegexPatternCheck
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
          try{
            Pattern.compile(pattern);
            System.out.println("Valid");
          }
            catch(Exception e)
            {
                System.out.println("Invalid");
            }
            testCases--;
		}
	}
}


/*
Problem Statement:
------------------
Using Regular Expressions (Regex), check whether a given pattern has a valid syntax.

You are given multiple test cases. For each test case, a string representing
a regular expression pattern is provided.

Your task is to determine whether the given regex pattern is valid or invalid.

A regex pattern is considered VALID if it can be successfully compiled
using Java's Pattern.compile() method.
If the pattern causes a syntax error while compiling, it is INVALID.

Input Format:
-------------
- The first line contains an integer T, the number of test cases.
- The next T lines contain strings representing regex patterns.

Output Format:
--------------
- For each test case, print "Valid" if the regex syntax is correct.
- Print "Invalid" if the regex syntax is incorrect.

Sample Input:
-------------
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output:
--------------
Valid
Invalid
Invalid

Explanation:
------------
Each regex pattern is checked for syntax correctness.
If the pattern compiles without error, it is valid; otherwise, it is invalid.
*/

