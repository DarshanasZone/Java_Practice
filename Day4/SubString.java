/* 
The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.

Constraints
1) 1<= s <= 100
2) 0 <= start < end <= n
3) String s consists of English alphabetic letters (i.e.a-zA-Z ) only.


Output Format

Print the substring in the inclusive range from start to end-1.


Sample Input :
Helloworld
3 7

Sample Output :
lowo

*/

import java.util.Scanner;

public class SubString {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        int n=S.length();
        
        if(0 <= start && start< end && end <= n )
        {
           System.out.println(S.substring(start, end));
        }
        
    }


}
