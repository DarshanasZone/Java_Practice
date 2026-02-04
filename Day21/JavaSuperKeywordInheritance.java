
/*
Problem: Java Super Keyword and Method Overriding

When a method in a subclass overrides a method in its superclass,
it is still possible to call the overridden method using the `super` keyword.

You are given classes that represent a Vehicle hierarchy:
- Vehicle
- Cycle (extends Vehicle)
- Motorcycle (extends Cycle)

Modify the code so that:
1. The Motorcycle class prints its own description.
2. It also calls the overridden method from its superclass using `super`.

Expected Output:
Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.
*/

import java.util.*;
import java.io.*;

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());

		// String temp=define_me();
         //Fix this line
         
         String temp = super.define_me(); //Answer


		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
class JavaSuperKeywordInheritance {
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}
