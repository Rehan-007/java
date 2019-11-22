package com.ustglobal.jaba8feature;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> {
			if(i%2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(p.test(1));
	}
}
