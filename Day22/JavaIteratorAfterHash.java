/*
Day 22: Java Iterator

Java Iterator helps to traverse elements in a collection.

In this problem, an ArrayList contains:
- Some integers
- A special string "###"
- Some strings after it

Task:
Modify the func() method so that the program prints ONLY the
elements that appear AFTER the special string "###".

Example:
Input list → [42, 10, "###", "Hello", "Java"]
Output:
Hello
Java

Constraint:
You can modify only 2 lines inside func() method.
*/




import java.util.*;
public class JavaIteratorAfterHash{
	
   static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){
   Object element = it.next();
         if(element instanceof String) 
			break;
		}
      return it;
      
   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      
      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      Iterator it=func(mylist);
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
   }
}
