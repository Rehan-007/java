package com.ustglobal.java8feature.function;

import java.util.function.Consumer;

public class TestE {

	public static void main(String[] args) {
		
		Consumer<Student> c = s -> {
			System.out.println("id is = "+s.id);
			System.out.println("name is = "+s.name);
			System.out.println("perce is = "+s.perc );
			System.out.println("-----------------------");
		};
		
		Student w = new Student(235, "Vijay", 69.69);
		c.accept( w);
	}
}
