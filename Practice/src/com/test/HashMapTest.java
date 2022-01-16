package com.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class HashMapTest {

	public static void main(String[] args) {

		// Interview question
		// guess the output
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("sujay", 0);
		hm.put(null, 3); // we can have only one null key
		hm.put("joy", null);// multiple null key allowed
		hm.put("roy", null);
		hm.put("Bhai", 2);
		hm.put("sujay", 1);
		// interview question-> as we repeat the key in hashmap it will override the key
		// with new value

		/**
		 * HashMap theory
		 * 
		 * HashMap in which we store data in key value pair Hashmap make by default 16
		 * bucket and each bucket will have likedList like data structure as in case of
		 * collision it will be useful after linkedList mean upto 8 collision after that
		 * it will form balanced binary search tree
		 * 
		 * internal:- according to key it calculate hashcode then that hashcode get map
		 * to 16 buket by taking mod 15 (size-1) and we should override hashCode and
		 * equal in case of hashmap if two key have same index then collision occurs and
		 * in the linkedlist of that get formed
		 * 
		 * Hashmap is not synchronized ,internally uses hashTable as data structure
		 * 
		 * hashmap conatin 1 null key
		 * 
		 * can have multiple null as values
		 */
		hm.forEach((K, V) -> {
			System.out.println("Key -> " + K + " value -> " + V);
		});

		/**
		 * 
		 * 
		 * here we will get exception ->java.util.ConcurrentModificationException at
		 * java.util.HashMap$HashIterator.nextNode(Unknown Source) as while iterating we
		 * are removing or updating the hashMap ,the reason behind this is hashmap is
		 * not thread safe not a syncronized so we get
		 * concurrentHasHmapModdificationException
		 * 
		 * 
		 */

//		Iterator<String>it=hm.keySet().iterator();
//		while(it.hasNext())
//		{
//			String key=it.next();
//			System.out.println(hm.get(key));
//			if(key.equals("Bhai"))
//			{
//				hm.put("joy",2);
//			}
//			
//		}

		/**
		 * 
		 * here we will not get any kind of exception as it is synchronized or we can
		 * say thread safe
		 * 
		 */
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<String, Integer>();
		chm.put("abc", 0);
		chm.put("pqr", 2);
		chm.put("xyz", 3);
		chm.put("abc", 1);

		Iterator<String> it = chm.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(hm.get(key));
			if (key.equals("xyz")) {
				hm.put("joy", 2);
				System.out.println(hm);
			}

		}

		// find out maximum count
		int max = 0;
		for (Integer key : chm.values()) {
			System.out.println(key);
			if (key > max) {
				max = key;
			}

		}
		System.out.println("maximum count is " + max);

		String maxkey = "";
		for (String key : chm.keySet()) {
			System.out.println(key);
			if (chm.get(key) > max) {
				max = hm.get(key);

			}

		}
		System.out.println("maximum count " + max);

	}

}
