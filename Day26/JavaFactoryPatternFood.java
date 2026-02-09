/* Day26
HackerRank Java Challenge – Factory Pattern

According to the Factory Design Pattern, a factory object returns another object 
from a method call instead of creating objects directly in the main method.

You are given:
• An interface Food with method getType()
• Two classes Pizza and Cake implementing Food

Task:
Complete the FoodFactory class by implementing the method:
    Food getFood(String order)

The method should:
• Return a new Pizza object if input = "pizza"
• Return a new Cake object if input = "cake"

Sample Input:
cake

Sample Output:
The factory returned class Cake
Someone ordered a Dessert!
*/


import java.util.*;
import java.security.*;
interface Food {
	 public String getType();
	}
	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}

	class Cake implements Food {

	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	class FoodFactory {
		public Food getFood(String order) {

        if(order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } 
        else if(order.equalsIgnoreCase("cake")) {
            return new Cake();
        }
        return null;


}//End of getFood method

	}//End of factory class

	public class JavaFactoryPatternFood {

	 public static void main(String args[]){
			Do_Not_Terminate.forbidExit();

		try{

			Scanner sc=new Scanner(System.in);
			//creating the factory
			FoodFactory foodFactory = new FoodFactory();
	
			//factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());
	
			
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	 }

	}
	class Do_Not_Terminate {
		 
	    public static class ExitTrappedException extends SecurityException {

			private static final long serialVersionUID = 1L;
	    }
	 
	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
	}	
		




