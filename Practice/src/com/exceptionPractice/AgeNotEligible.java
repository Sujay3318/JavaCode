package com.exceptionPractice;

import java.util.Scanner;

//complie time Exception
public class AgeNotEligible extends Exception {

	public AgeNotEligible() {
		super("Age Is less");
		// System.out.println("Age is less");

	}

	// if we add throws exception_name abnormal termination take place we have to
	// use
	// try catch
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

		try {
			if (age < 18) {
				throw new AgeNotEligible();
			} else {
				System.out.println("Eligible");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hii");
	}
}
