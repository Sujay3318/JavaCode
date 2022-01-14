package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsListTest {
	public static void main(String[] args) {

		/**
		 * List is interface
		 * 
		 * inside ArrayList we have ArrayList , LinkedList , vector
		 * with help of index we access it most important point
		 * internal of arrayList 1 ,2,3 ,4,5 ,6 is arrayList then if get data it will be
		 * o(1) as it implements random access
		 *  updating  deletion operation will take o(n) as we are going to perform shift operation basically it uses for fetch
		 * operation
		 * not synchronized or we can say not thread safe so we will get concurrentModification exception
		 * 
		 */
		// not a type safe ArrayList object
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

		System.out.println("Sorting inbult provide by collection is class");
		Collections.sort(obj);
		System.out.println("Min elemnt finding max elemnet finding inbuilt");
		Collections.min(obj);
		System.out.println("swapping is also inbuilt provided");
		Collections.swap(obj, 0, 1);
		//rotate reverse etc methods are also there
		
		/*
		 * Arraylist data will be store as array 
		 * so shifting operation will take place
		 */
		
		System.out.println("***********************************************************************");
		
		/*
		 * it is like linked list node and next pointer will be there so
		 * insertion deletion all will be like linkedList operation as in arrayList its like array 
		 * so according time complexity varies
		 * so node link Updation take constant time so here deletion updation is faster as compare to
		 * arrayList .
		 * not thread safe so we will get concurentHAsmodfication erroe
		 * 
		 */
		List<String>str=new LinkedList<String>();
		str.add("abc");
		str.add("pqr");
		str.add("kyc");
		System.out.println("Linkedlist data");
		Iterator<String>it=str.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		/*
		 * vector is deprecated now but its thread safe
		 */
		
		
	}

}
