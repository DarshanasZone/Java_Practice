
/*
Day 22: Java instanceof Operator

The Java `instanceof` operator is used to test whether an object belongs
to a specific class or not.

In this problem, three classes are provided:
- Student
- Rockstar
- Hacker

An ArrayList is populated with objects of these classes.
The task is to count how many instances of each class are present in the list
using the instanceof operator.

Input:
Number of objects followed by class names.

Output:
Three integers:
- Number of Student instances
- Number of Rockstar instances
- Number of Hacker instances
*/


import java.util.*;


class Student{}
class Rockstar{   }
class Hacker{}


public class JavaInstanceOfExample{
	
   static String count(ArrayList mylist){
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++){
         Object element=mylist.get(i);
          if(element instanceof Student)
            a++;
         if(element instanceof Rockstar)
            b++;
         if(element instanceof Hacker)
            c++;
      }
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i=0; i<t; i++){
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}