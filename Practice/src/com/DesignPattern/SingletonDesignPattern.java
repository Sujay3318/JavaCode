package com.DesignPattern;

import javax.management.RuntimeErrorException;

/*
 * 
 * Creational
 * behavioral
 * Structural
 */
public class SingletonDesignPattern {

	/**
	 * 
	 * thread safe + reflection api loop whole resolved
	 * 
	 */
	private static SingletonDesignPattern st; // = new SingletonDesignPattern();

	/*
	 * private constructor
	 */
	private SingletonDesignPattern() {
		if (st != null) {
			throw new RuntimeException("get your object instance by getInstance");
		}
	}

	public static SingletonDesignPattern getSingletonDesignPattern() {
		if (st == null) {
			synchronized (SingletonDesignPattern.class) {
				if (st == null) {
					st = new SingletonDesignPattern();
				}
			}

		}

		return st;
	}

}
