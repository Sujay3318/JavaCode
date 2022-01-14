package com.test;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {

		//MCQ in oracle free certification  parent can hold chil class object
		parentInterface[] p= {new ChildClass1(),new ChildClass2()};
		p[0].shape();
		p[1].shape();
		
		/**
		 * threshold is 0.75 then after that it will grow the size in double size that
		 * example 10 0.75 is approximately 7 after 7 element size grow to 20 same way
		 * after 14 element size will grow to 40 null pointer example basic idea
		 * variable get assign to null and we are trying to perform operation on it then
		 * we get null pointer exception
		 */
		// int a=(Integer) null;
		// int b=10;
		// int c=a+b;
		// System.out.println(c);

		/**
		 * repeated element get printed one time
		 */
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(4);
		s.add(1);

		/*
		 * s take integer so t will be integer
		 * 
		 */

		s.forEach(t -> System.out.println(t));
		int sum = 0;
		for (Object obj : s) {
			sum = sum + (Integer) obj;
			System.out.println(obj);
		}
		System.out.println("sum is " + sum);
	}

}
