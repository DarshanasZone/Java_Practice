
/*
Day29 - Java Lambda Expressions

Write methods that return lambda expressions:
1) isOdd()        -> returns true if number is odd
2) isPrime()      -> returns true if number is prime
3) isPalindrome() -> returns true if number is palindrome

Output must be:
ODD / EVEN
PRIME / COMPOSITE
PALINDROME / NOT PALINDROME


this code supports Java7 version
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


interface PerformOperation {
    boolean check(int a);
}
class MyMath {

    public PerformOperation isOdd() {
        return new PerformOperation() {
            public boolean check(int a) {
                return a % 2 != 0;
            }
        };
    }

    public PerformOperation isPrime() {
        return new PerformOperation() {
            public boolean check(int a) {
                if (a < 2) return false;
                for (int i = 2; i <= Math.sqrt(a); i++) {
                    if (a % i == 0) return false;
                }
                return true;
            }
        };
    }

    public PerformOperation isPalindrome() {
        return new PerformOperation() {
            public boolean check(int a) {
                String s = Integer.toString(a);
                String rev = new StringBuilder(s).reverse().toString();
                return s.equals(rev);
            }
        };
    }

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
}


public class JavaLambdaExpressions{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        

        Scanner sc = new Scanner(System.in);
        MyMath ob = new MyMath();

        int T = sc.nextInt();
        while (T-- > 0) {
            int ch = sc.nextInt();
            int num = sc.nextInt();

            PerformOperation op;
            boolean result;

            if (ch == 1) {
                op = ob.isOdd();
                result = MyMath.checker(op, num);
                System.out.println(result ? "ODD" : "EVEN");
            } 
            else if (ch == 2) {
                op = ob.isPrime();
                result = MyMath.checker(op, num);
                System.out.println(result ? "PRIME" : "COMPOSITE");
            } 
            else if (ch == 3) {
                op = ob.isPalindrome();
                result = MyMath.checker(op, num);
                System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}


