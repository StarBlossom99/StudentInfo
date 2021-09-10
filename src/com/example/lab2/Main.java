package com.example.lab2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101,"Kim",23);
		al.add(s1);
		Student s2 = new Student(102,"Lee",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Han",21));
		al.add(new Student(105,"Yang",24));
		al.add(new Student(106,"Jo",21));
		al.add(new Student(107,"Choi",22));
		al.add(new Student(108,"Bae",21));
		al.add(new Student(109,"Kang",22));
		al.add(new Student(110,"Jeon",23));
		
		
		Collections.sort(al);
		for(Student s : al) {
			System.out.println(s.toString());
		}
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Student List (reverse ordered by name)");
		for(int i =0; i<al.size();i++) {
			System.out.println(al.get(i).toString());
		}
	}
}
