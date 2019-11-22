package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(56);
		al.add(69);
		al.add(89);
		al.add(6589);
		al.add(45);
		
		List<Integer> l = al.stream().map(i -> i + 50).collect(Collectors.toList());
		System.out.println(l);
		
		for(Integer i : l) {
			System.out.println(i);
		}
		
	}
}
