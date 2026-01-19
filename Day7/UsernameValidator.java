
package Day7;
import java.util.Scanner;
class UsernameValidatorr {
    /*
     * Write regular expression here.
     */
      public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
}


public class UsernameValidator {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidatorr.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}





/*
Problem Statement:
A username is considered valid if it satisfies the following conditions:
1. The username length must be between 8 and 30 characters (inclusive).
2. The username can contain only alphanumeric characters (a–z, A–Z, 0–9) and underscores (_).
3. The first character of the username must be an alphabetic character (a–z or A–Z).

Task:
Write a regular expression that matches only valid usernames.
The regular expression should be assigned to the 'regularExpression' variable
inside the UsernameValidator class.

Input:
Multiple usernames as strings.

Output:
For each username, print "Valid" if it matches the rules, otherwise print "Invalid".
*/
