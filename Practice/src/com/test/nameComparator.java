package com.test;

import java.util.Comparator;

public class nameComparator implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		
		return o1.getsName().compareTo(o2.getsName());
	}

	
	
	

}
