
/*
HackerRank – Day 20
Problem: Java Priority Queue

Problem Statement:
A priority queue is a data structure where each element has a priority,
and elements with higher priority are served before elements with lower
priority.

In this problem, students enter a service queue and are served based on
the following priority rules:
1. Higher CGPA is served first.
2. If CGPA is the same, students are served in ascending alphabetical
   order of name (case-sensitive).
3. If CGPA and name are the same, students are served in ascending order
   of their ID.

Two types of events occur:
- ENTER name CGPA id : Add a student to the queue
- SERVED : Remove the student with the highest priority

After processing all events, print the names of students still waiting
in the queue in priority order. If no students remain, print "EMPTY".

Concepts Used:
- PriorityQueue
- Comparator
- Object-Oriented Programming
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
 import java.util.*;

/* Student class */
class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

/* Priorities class */
class Priorities {

    public List<Student> getStudents(List<String> events) {

      PriorityQueue<Student> pq = new PriorityQueue<Student>(
    1,
    new Comparator<Student>() {
        public int compare(Student s1, Student s2) {

            if (Double.compare(s2.getCGPA(), s1.getCGPA()) != 0) {
                return Double.compare(s2.getCGPA(), s1.getCGPA());
            }

            if (!s1.getName().equals(s2.getName())) {
                return s1.getName().compareTo(s2.getName());
            }

            return Integer.compare(s1.getID(), s2.getID());
        }
    }
);

        for (String event : events) {
            String[] parts = event.split(" ");

            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                pq.add(new Student(id, name, cgpa));
            } else {
                pq.poll(); // SERVED
            }
        }

        List<Student> result = new ArrayList<Student>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        return result;
    }
}


public class JavaPriorityQueueStudents {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}