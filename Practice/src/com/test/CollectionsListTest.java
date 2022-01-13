package com.test;

import java.util.ArrayList;
import java.util.List;

public class CollectionsListTest {
	public static void main(String[] args) {

		/**
		 * List is interface
		 * 
		 * inside Arraylist we have ArrayList , LinkedList , vector
		 * 
		 * internal of arrayList 1 ,2,3 ,4,5 ,6 is arraylist then if get data it will be
		 * o(1) as it implemts randomaccess updation or deletion operation will take
		 * o(n) as we are going to perform shift opeartion basically it uses for fetch
		 * operation
		 * 
		 */
		// not a type safe arraylist object
		List objl = new ArrayList();
		objl.add(null);
		objl.add(1);
		objl.add("Strfng");
		objl.add(1.8);
		objl.add(45678);
		System.out.println("not atype safe arraylist " + objl);

		// typesafe arraylist object
		List<String> obj = new ArrayList<String>();

		// Crud operations

		// create
		obj.add("sujay");
		obj.add("surjay");
		obj.add("suyash");

		for (String s : obj) {
			System.out.print(s + " ");
		}
		System.out.println();
		// get/ read
		System.out.println("index 1 element is " + obj.get(1));

		// delete
		obj.remove(2);

		// update
		System.out.println("we are updating  element at index 1 ");
		obj.add(1, "bhai");
		System.out.println("index 1st updated element is " + obj.get(1));

	}

}
