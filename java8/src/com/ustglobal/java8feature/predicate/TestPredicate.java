package com.ustglobal.java8feature.predicate;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		
		Predicate<Employee> em = e ->{
			if(e.sal > 20000) {
				return true;
			} else {
				return false;
			}
		};
		
		Employee e = new Employee(1, "Ashit", 30000);
		System.out.println(em.test(e));
	}
}
