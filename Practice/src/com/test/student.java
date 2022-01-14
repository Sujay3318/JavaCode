package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class student {
	int sId;
	String sName;
	float salary;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public student(int sId, String sName, float salary) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.salary = salary;
	}
	
	
	
@Override
	public String toString() {
		return "student [sId=" + sId + ", sName=" + sName + ", salary=" + salary + "]";
	}

public static void main(String[] args) {
	
	IdComparator ic=new IdComparator();
	List<student>l=new ArrayList<student>();
	l.add(new student(1,"abc",1234));
	l.add(new student(2, "suja", 123));
	l.add(new student(4, "suja", 123));
	l.add(new student(3, "suja", 123));
	Collections.sort(l,ic);
	System.out.println(l);

	nameComparator in = new nameComparator();
	Collections.sort(l, in);
	System.out.println(l);
}
	
}
