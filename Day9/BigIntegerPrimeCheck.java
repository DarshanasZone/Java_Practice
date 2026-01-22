
/*
Question:
A prime number is a natural number greater than 1 whose only positive divisors
are 1 and itself.

Given a large integer n, determine whether it is prime or not using Java's
BigInteger class and its isProbablePrime() method.

Input Format:
A single line containing an integer n.

Constraints:
n contains at most 100 digits.

Output Format:
Print "prime" if n is a prime number, otherwise print "not prime".
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class BigIntegerPrimeCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        bufferedReader.close();

        BigInteger num = new BigInteger(n);

        if (num.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}