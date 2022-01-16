package com.DesignPattern;

public class SingletonDesignPatternTest {
	public static void main(String[] args) {

		SingletonDesignPattern singletonobj1 = SingletonDesignPattern.getSingletonDesignPattern();
		System.out.println(singletonobj1);

		SingletonDesignPattern singletonobj2 = SingletonDesignPattern.getSingletonDesignPattern();
		System.out.println(singletonobj2);
		
		
	}
}
