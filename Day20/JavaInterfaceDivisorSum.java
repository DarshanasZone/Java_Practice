
/*
Day 21 – Java Interface

Problem Statement:
A Java interface can only contain method signatures and fields.
Interfaces are used to achieve polymorphism.

You are given an interface named AdvancedArithmetic that contains
a method signature:

    int divisor_sum(int n);

Task:
Create a class named MyCalculator that implements the AdvancedArithmetic
interface and overrides the divisor_sum method.

The divisor_sum method should:
- Take an integer n as input
- Return the sum of all its divisors

Example:
Input: 6
Divisors: 1, 2, 3, 6
Output: 12

Constraints:
- 1 ≤ n ≤ 1000
- The MyCalculator class must NOT be public

Sample Input:
6

Sample Output:
I implemented: AdvancedArithmetic
12
*/



import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
class JavaInterfaceDivisorSum{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

