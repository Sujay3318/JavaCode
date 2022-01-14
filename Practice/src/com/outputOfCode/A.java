package com.outputOfCode;

import java.util.ArrayList;

public class A extends B {

	public static void main(String[] args) {
		// B is parent of a
		A a = new A();
		if (a instanceof A) {
			System.out.println("a is instance of A");
		}

		// child class object is instance of parentthat means parent can hold child
		// class object
		B b = new A();
		if (b instanceof A) {
			System.out.println("b is instance of A ");
		}

		if (b instanceof B) {
			System.out.println("b is instance of B ");
		}

		if (a instanceof B) {
			System.out.println("a is instance of B ");
		}

		// when object get created instance get form
		A a1 = null;
		// here a1 is not instance of a as object is not get created
		if (a1 instanceof A) {
			System.out.println("a1 is instance of A");
		} else {
			System.out.println("a1 is not instance of A as it is not get created");
		}

		Integer data = null;
		if (data instanceof Integer) {
			System.out.println("True");
		}

		ArrayList l = new ArrayList();
		l.add(12);
		l.add(new A());

		Object obj = l.get(1);
		if (obj instanceof A) {
			// perform a related operation
			A a2 = (A) obj;
			System.out.println(a2);
		}

	}
}
