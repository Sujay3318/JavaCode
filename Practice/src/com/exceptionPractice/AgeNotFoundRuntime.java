package com.exceptionPractice;

import java.util.Scanner;

public class AgeNotFoundRuntime extends RuntimeException {

	public AgeNotFoundRuntime() {
		super("Under age");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

		// need to add try catch else abnormal termination will take place at runtime
		// throws use for checked exceptions it doesnot handle exception we need try
		// catch **throws exception can use with class and method and can use multiple
		// time go with class

		// throw used for unchecked exceptions , one time new Instance() go with
		// instance
		try {
			if (age < 18) {
				throw new AgeNotFoundRuntime();
			} else {
				System.out.println("Eligible");
			}
		} catch (Exception e) {

		} finally {
			System.out.println("This always get exceuted");
		}
		System.out.println("Hii");

	}

}
