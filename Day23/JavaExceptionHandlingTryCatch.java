
/*
Day 23: Java Exception Handling (Try-Catch)

Task:
Read two integers a and b from input and print a / b.

If inputs are not valid 32-bit integers OR if b = 0,
handle the exception and print the exception message.

Possible outputs:
- Result of division
- java.util.InputMismatchException
- java.lang.ArithmeticException: / by zero
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaExceptionHandlingTryCatch{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        }
        catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}