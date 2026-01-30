/*
HackerRank – Java Dequeue

Problem Statement:
You are given N integers and a subarray size M.
Your task is to find the maximum number of unique integers
present in any contiguous subarray of size M.

You must consider all possible contiguous subarrays of size M
and determine the maximum count of distinct elements among them.

Input Format:
- First line contains two integers N and M
- Second line contains N space-separated integers

Output Format:
- Print the maximum number of unique integers

Concepts Used:
- Deque (ArrayDeque)
- HashSet
- Sliding Window Technique
*/

    import java.util.*;
    public class JavaDequeMaxUniqueSubarray {
        public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            // add element to deque and set
            deque.addLast(num);
            set.add(num);

            // if window size exceeds m, remove from front
            if (deque.size() > m) {
                int removed = deque.removeFirst();

                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }

            // update maximum unique count
            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, set.size());
            }
        }

        System.out.println(maxUnique);
    }
}
