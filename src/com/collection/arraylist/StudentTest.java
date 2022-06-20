package com.collection.arraylist;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student(1, 101, "rahul");
		Student student2 = new Student(2, 102, "suraj");
		Student student3 = new Student(3, 103, "prajit");
		Student student4 = new Student(4, 104, "sanket");

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(student1);
		al.add(student2);
		al.add(student3);
		al.add(student4);

		for (Student s : al) {
			System.out.println(s);
		}

	}

}
