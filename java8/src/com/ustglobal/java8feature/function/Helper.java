package com.ustglobal.java8feature.function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	
	Comparator<Student> cmp = (c1,c2) ->{
		return ((Double)c1.perc).compareTo((Double)c2.perc);
		
	};

	void displayAllStudent(ArrayList<Student> as) {
		
		Iterator<Student> i = as.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.perc);
			System.out.println("---------------------------------------");
		}
		
	}
	
	void displayFailedStudent (ArrayList<Student> ar) {
		
	List<Student> l =	ar.stream().filter(f -> f.perc < 40).collect( Collectors.toList());
	 
	for(Student s : l) {
		System.out.println(s);
	}
	}
	
	void displayPassStudent(ArrayList<Student> al) {
		List<Student> l = al.stream().filter(p -> p.perc>40 ).collect(Collectors.toList());
		for(Student s : l) {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.perc);
			System.out.println("---------------------------------------");
		}
	}
	
	void topper(ArrayList<Student> al) {
		Student s = al.stream().max(cmp).get();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.perc);
		System.out.println("---------------------------------------");
	}
	void failur(ArrayList<Student> al) {
		Student s = al.stream().min(cmp).get();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.perc);
		System.out.println("---------------------------------------");
	}
}
