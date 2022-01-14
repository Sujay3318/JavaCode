package com.outputOfCode;

public class TestApp {
int i[]= {0};
	
int id;
String name;
public TestApp(int id, String name) {
	super();
	
	this.id = id;
	this.name = name;
}

public static void main(String[] args) {
	
	int i[]= {1};
	alter(i);
	//it support pass by value to the reffreces 
	System.out.println(i[0]);
	//for state it will consider as pass by refference
	TestApp obj1=new TestApp(1,"sujay");
	TestApp obj2=new TestApp(2,"bhai");
	int p=10;
	p=12;
	p=13;
	System.out.println(obj1.name+ "  "+ obj2.name);
	Swap(obj1,obj2);
	System.out.println(obj1.name+ "  "+ obj2.name);
	//System.out.println(args[1]+args[2]+args[3]);

	System.out.println(obj1.name+ "  "+ obj2.name);
	SwapByState(obj1,obj2);
	System.out.println(obj1.name+ "  "+ obj2.name);
	
}

private static void SwapByState(TestApp obj1, TestApp obj2) {
	// TODO Auto-generated method stub
	String temp=obj1.name;
	obj1.name=obj2.name;
	obj2.name=temp;
	
}

private static void Swap(TestApp obj1, TestApp obj2) {
	// TODO Auto-generated method stub
	obj1=obj2;	
}

private static void alter(int[] i) {
	// TODO Auto-generated method stub
	int j[]= {2};
	i=j;
}


	
}
