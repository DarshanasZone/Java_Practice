

/*
HackerRank – Day 17
Problem: Java Comparator (Student Sorting)

Problem Statement:
You are given a list of student information containing:
- ID (integer)
- First Name (string)
- CGPA (double)

Your task is to sort the students based on the following rules:
1. Sort by CGPA in descending order.
2. If two students have the same CGPA, sort them by first name in alphabetical order.
3. If both CGPA and first name are the same, sort them by ID in ascending order.
4. No two students have the same ID.

After sorting, print the first name of each student on a new line.

Input Format:
- The first line contains an integer N, the number of students.
- The next N lines contain student details in the format:
  ID FirstName CGPA

Output Format:
- Print the first name of each student after sorting, one per line.

Concepts Used:
- Java Comparator
- Collections.sort()
- Object-oriented programming

*/

import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class JavaComparatorStudentSorting
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        //Code which is asked to complete :
        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0)
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                if (!s1.getFname().equals(s2.getFname()))
                    return s1.getFname().compareTo(s2.getFname());
                return Integer.compare(s1.getId(), s2.getId());
            }
        });

        
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



