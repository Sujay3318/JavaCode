package com.test;

import java.util.Set;
import java.util.TreeSet;

public class CollectionTressSet {

	public static void main(String[] args) {

		/*
		 * sort two array using tree set i can do
		 * 
		 * we can put two pointer and solve the question a[i] > b[j] small fill to c[k]
		 * 
		 */

		int[] a = { 1, 3, 6, 7 };
		int[] b = { 2, 5 };
		Set<Integer> s = new TreeSet<Integer>();

		// s.add(null); tree set not take null value

		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			s.add(b[i]);
		}
		System.out.println(s);

		
	}
}
