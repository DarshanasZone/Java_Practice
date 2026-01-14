/*
outputs the area of a parallelogram with breadth  and height .
 You should read the variables from the standard input.


 If both values are greater than zero, then the main method must output the area of the parallelogram.
 Otherwise B<=0 or H<=0 -----> print "java.lang.Exception: Breadth and height must be positive" without 
 quotes.

*/
import java.io.*;
import java.util.*;


public class Satic_Initializer {
    
    static int B;
    static int H;
    static boolean flag=true;
    
    
    static{
        Scanner sc=new Scanner(System.in);
         B=sc.nextInt();
         H=sc.nextInt();
        
        if(B<=0 || H<=0)
        {
            System.out.println( "java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

