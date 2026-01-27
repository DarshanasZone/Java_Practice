/*
Problem:
You are given a list of integers and a set of queries to perform on it.
Each query is either:

Insert an element at a specific index

Delete an element from a specific index

After performing all queries, print the final list as space-separated integers.

Concepts used:

ArrayList

Insert and Delete operations

Index-based list manipulation
*/



import java.util.*;

public class  ListInsertDeleteOperations{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read initial list size
        int n = sc.nextInt();

        // Read list elements
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Number of queries
        int q = sc.nextInt();

        // Process queries
        for (int i = 0; i < q; i++) {
            String operation = sc.next();

            if (operation.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (operation.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }

        sc.close();

        // Print final list
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
