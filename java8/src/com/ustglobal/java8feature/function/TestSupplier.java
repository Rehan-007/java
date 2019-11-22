package com.ustglobal.java8feature.function;

import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		
		Supplier<Student> s = () -> new Student(2,"vijay",65.65);
		
		Student s1 = s.get();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.perc);
		
		Supplier<Integer> i = () -> 20;
		int val = i.get();
		System.out.println(val);
		
		Supplier<String> ss = () -> "MIA";
		String g = ss.get();
		System.out.println(g);
   }
}
