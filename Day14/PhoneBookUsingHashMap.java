
/*
 Problem: Java Map (Phone Book)

 You are given a phone book that consists of people's names and their phone numbers.
 After storing the entries, you will be given several queries. For each query, you
 must print the corresponding phone number if it exists.

 Input Format:
 - The first line contains an integer n, the number of entries in the phone book.
 - The next n entries consist of:
     • a name (string, may contain spaces)
     • a phone number (8-digit integer)
 - After the phone book entries, there are multiple query lines.
 - Each query contains a name. Input ends at EOF.

 Output Format:
 - For each query:
     • If the name exists in the phone book, print: name=phoneNumber
     • Otherwise, print: Not found

 Constraints:
 - Names contain only lowercase English letters and may include spaces.
 - Phone numbers contain exactly 8 digits with no leading zero.

 Example:
 Input:
 3
 uncle sam
 99912222
 tom
 11122222
 harry
 12299933
 uncle sam
 uncle tom
 harry

 Output:
 uncle sam=99912222
 Not found
 harry=12299933

 Approach:
 - Use a HashMap to store name–phone number pairs.
 - Read queries until end-of-file (EOF) and check for existence in the map.
*/



import java.util.*;

class PhoneBookUsingHashMap{
	  public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine(); // consume newline

        // Create phone book
        Map<String, Integer> phoneBook = new HashMap<>();

        // Read entries
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine(); // consume newline
            phoneBook.put(name, phone);
        }

        // Process queries until EOF
        while (in.hasNextLine()) {
            String s = in.nextLine();

            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
