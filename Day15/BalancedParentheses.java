/*
Problem Statement:
In computer science, a stack or LIFO (Last In First Out) is a data structure
that supports two main operations: push and pop.

A string containing only parentheses is balanced if:
1. It is an empty string
2. If A and B are balanced, AB is balanced
3. If A is balanced, then (A), {A}, and [A] are also balanced

Examples of balanced strings:
{}(), [{()}], ({()})

Examples of unbalanced strings:
{}(, ({)}, [[, }{

Input Format:
- Multiple lines of input
- Each line contains a non-empty string
- Read input until end-of-file

Output Format:
- Print "true" if the string is balanced
- Print "false" otherwise
*/

import java.util.*;

class BalancedParentheses  {
    
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            boolean balanced = true;

            for (char ch : input.toCharArray()) {

                // for Opening brackets
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } 
                // for Closing brackets
                else {
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    }

                    char top = stack.pop();

                    if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                        balanced = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) balanced = false;

            System.out.println(balanced);
        }
        
        sc.close();
    }
}
