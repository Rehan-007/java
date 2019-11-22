package com.ustglobal.java8feature.function;

import java.util.function.Function;

public class TestA {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		Integer n = f.apply(5);
        System.out.println(n);
	}
}
