package com.test;

public class ParentChildMethod {

	public static void main(String[] args) {
		Child c = new Child();
		c.display();

		// parent can hold child object it is dynamic dispatch
		// method new child() priority
		// variable parent(reference) priority
		
		// inheritance common in parent
		// uncommon split in child
		// parent child is a relationship

	}

}
