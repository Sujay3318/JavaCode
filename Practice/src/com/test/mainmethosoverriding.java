package com.test;

public class mainmethosoverriding {

	public static void main(String[] args) {
		System.out.println("we can oveloadding main method");
		System.out.println("we cannot override main method as it is static and final method u cannot override it");
	}

	public static void main(int a) {
		System.out.println("Integer" + a);
	}

	public static void main(String s1, int s2) {
		System.out.println("string" + s1 + " inetger" + s2);
	}

}
