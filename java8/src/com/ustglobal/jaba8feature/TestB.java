package com.ustglobal.jaba8feature;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		
		Predicate<Student> s = s1 -> {
			if(s1.perce > 35) {
				return true;
			} else {
				return false;
			}
		};
		
		Student s1 = new Student(1, "Ananya", 55.55);
		System.out.println(s.test(s1));
	}
}
