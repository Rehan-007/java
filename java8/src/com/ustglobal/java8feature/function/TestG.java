package com.ustglobal.java8feature.function;

import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student(1, "Bahu", 69));
		al.add(new Student(2, "Bahubali", 99));
		al.add(new Student(3, "anu", 35));
		al.add(new Student(4, "rehan", 79));
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//		h.displayFailedStudent(al);
//		h.displayPassStudent(al);
		h.topper(al);
		
		
	}
}
