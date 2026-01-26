
    /*
  
     * Problem:
     * You are given a binary array and a leap value.
     * Starting from index 0, you can:
     * 1. Move forward by 1 if the cell contains 0
     * 2. Move backward by 1 if the cell contains 0
     * 3. Jump forward by 'leap' if the destination contains 0
     *
     * If you move beyond the last index of the array, you win the game.
     *
     * Task:
     * Implement canWin() to determine whether the game can be won.
     */

import java.util.*;

public class Java1DArrayLeapGame {

    public static boolean canWin(int leap, int[] game) {
        return canWinFrom(0, leap, game);
    }

    // Helper method using recursion + visited marking
    private static boolean canWinFrom(int index, int leap, int[] game) {

        // Win condition: reached or crossed end
        if (index >= game.length) {
            return true;
        }

        // Invalid move or blocked cell
        if (index < 0 || game[index] == 1) {
            return false;
        }

        // Mark current index as visited
        game[index] = 1;

        // Try all possible moves
        return canWinFrom(index + leap, leap, game) ||
               canWinFrom(index + 1, leap, game) ||
               canWinFrom(index - 1, leap, game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
        scan.close();
    }
}
