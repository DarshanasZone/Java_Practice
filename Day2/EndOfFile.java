
import java.util.*;


public class EndOfFile {

    public static void main(String[] args) {
    
        Scanner sc =new Scanner(System.in);
        
         
         // sc.hasNextLine() : Checks “Is there another line to read?”
          for(int i=1; sc.hasNextLine(); i++) //for line number
          {
            
         // nextLine() :  Reads ENTIRE line and Stops only at Enter key
                String s1=sc.nextLine();
                 System.out.println(i + " "+ s1);
              
          }
          
    }
}