/* 
JavaLoops.java

Sample Input

2
0 2 10
5 3 5


Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

----------------------------------------------------------------------
*/


import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
           Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();   // number of queries-2

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt(); //0
            int b = sc.nextInt(); //2
            int n = sc.nextInt(); //10

            int sum = a;
            int power = 1;

            for (int j = 0; j < n; j++) {
                sum = sum + b * power;
                System.out.print(sum + " ");
                power = power * 2;
            }

            System.out.println(); // new line after each query
        }
        
        sc.close();
}
}

/* 


OUTPUT :-

2         -----q=2
0 2 10    ------a=0, b=2, n=10
2 6 14 30 62 126 254 510 1022 2046 


5 3 5      ------a=5, b=3, n=5
8 14 26 50 98 


*/