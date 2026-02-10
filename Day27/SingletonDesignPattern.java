
/*
HackerRank Java Challenge – Singleton Design Pattern

Task:
Complete the Singleton class with:
• A private non-parameterized constructor.
• A public String variable named str.
• A static method getSingleInstance() that returns the single instance.

The class must ensure only ONE object of Singleton can ever be created.

Concepts used:
• Singleton Design Pattern
• Private constructor
• Static instance
• Reflection validation

Expected Output (handled by hidden code):
Hello I am a singleton! Let me say <input> to you
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {

    // public string variable
    public String str;

    // private static instance
    private static Singleton instance;

    // private constructor
    private Singleton() {}

    // static method to return single instance
    public static Singleton getSingleInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
public class SingletonDesignPattern{

 public static void main(String args[])throws Exception{
	
	Scanner sc=new Scanner(System.in);
	Singleton s1 = Singleton.getSingleInstance(); //retrive the single instance
    Singleton s2=Singleton.getSingleInstance();
    assert(s1==s2);
    
	//verify that the constructor is private
	Class c=s1.getClass();
	Constructor[] allConstructors = c.getDeclaredConstructors();
	assert allConstructors.length==1;
	for (Constructor ctor : allConstructors) 
	{
		if(ctor.getModifiers()!=2 || !ctor.toString().equals("private Singleton()")) //The constructor must be private
		{
			System.out.println("Wrong class!");
		}
	}
    String str=sc.nextLine();
	s1.str=str;
    s2.str=str;
    System.out.println("Hello I am a singleton! Let me say "+str+" to you");
	
 }

}

