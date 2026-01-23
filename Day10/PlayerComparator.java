/*
Day 11 – Sorting Objects Using Comparator

Problem Statement:
Given a list of Player objects, each having a name and a score,
sort the players using the following rules:

1. Sort players in decreasing order of score.
2. If two or more players have the same score,
   sort them alphabetically by name (ascending order).

You must implement a Checker class that implements the
Comparator<Player> interface and override the compare method.
*/


import java.util.*;

// Write your Checker class here

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        // Sort by score in descending order
        if (a.score != b.score) {
            return b.score - a.score;
        }
        // If scores are equal, sort by name alphabetically
        return a.name.compareTo(b.name);
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class PlayerComparator  {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}