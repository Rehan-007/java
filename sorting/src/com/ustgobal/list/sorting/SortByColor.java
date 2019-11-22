package com.ustgobal.list.sorting;

import java.util.Comparator;

public class SortByColor implements Comparator<Marker> {

	@Override
	public int compare(Marker o1, Marker o2) {
		
		String s = o1.color;
		String t = o2.color;
		return s.compareTo(t);
	}

	
}
