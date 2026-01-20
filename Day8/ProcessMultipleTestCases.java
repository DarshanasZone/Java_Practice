
/*
Problem Statement:
Given an integer T representing the number of test cases, write a Java program
that reads T lines of text from standard input. For each test case, the program
should accept a string input and perform the required processing.
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProcessMultipleTestCases{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		 // Regex pattern to match valid tags and content
        Pattern pattern = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");

        while(testCases > 0){
            String line = in.nextLine();
            
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
            
            testCases--;
        }
        in.close();
    }
}


