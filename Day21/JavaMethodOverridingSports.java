
/*
Day 21: Java Method Overriding

When a subclass inherits from a superclass, it also inherits its methods.
However, the subclass can override methods of the superclass.

Given a Sports class with:
- getName() method returning "Generic Sports"
- getNumberOfTeamMembers() method printing:
  "Each team has n players in Generic Sports"

Create a Soccer class that:
- Overrides getName() to return "Soccer Class"
- Overrides getNumberOfTeamMembers() to print:
  "Each team has 11 players in Soccer Class"

Output should be:
Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
*/


import java.util.*;
class Sports{

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here
 @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }

}

public class JavaMethodOverridingSports
 {
	
    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}
}


