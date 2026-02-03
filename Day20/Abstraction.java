
/*
Day 20 – Java Abstract Class

Problem Statement:
A Java abstract class is a class that cannot be instantiated.
It works as a base class for subclasses.

You are given an abstract class named Book with:
- A String variable title
- An abstract method setTitle(String s)
- A concrete method getTitle() that returns the title

Task:
Create a class named MyBook that extends the Book class and:
1. Implements the abstract method setTitle(String s)
2. Stores the given title in the title variable

Constraints:
- The MyBook class must NOT be public.

Input:
A single line containing the book title.

Output:
Print the title in the format:
The title is: <book title>

Sample Input:
A tale of two cities

Sample Output:
The title is: A tale of two cities
*/


import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

//Write MyBook class here
class MyBook extends Book {
    void setTitle(String s) {
        title = s;
    }
}

public class Abstraction{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}