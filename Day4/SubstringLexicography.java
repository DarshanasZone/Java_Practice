
/*
You are given:
A string s
An integer k


 You must generate output as :
-Generate ALL substrings of length k
-Compare them lexicographically (dictionary order)


Find:
- smallest substring
- largest substring

******Print them on separate lines


Sample Input :
welcometojava
3


Sample Output :
ava
wel

*/


import java.util.Scanner;

public class SubstringLexicography {

    public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
      
        int n=s.length();
        for(int i=0; i<=n-k; i++)
        {
              String sub=s.substring(i, i+k);
              
          if (sub.compareTo(smallest) < 0)
           {
                smallest = sub;
            }

            if (sub.compareTo(largest) > 0)
            {
                largest = sub;
            }
        }
       
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}