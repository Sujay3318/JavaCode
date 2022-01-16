package com.test;

import java.util.ArrayList;
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

		IdComparator ic = new IdComparator();

		List<student> l = new ArrayList<student>();

		l.add(new student(1, "a", 1234));
		l.add(new student(2, "b", 123));
		l.add(new student(4, "C", 123));
		l.add(new student(3, "D", 123));
		l.add(new student(5, "1D", 123));

		Collections.sort(l, ic);

		System.out.println(l);

		nameComparator in = new nameComparator();

		//sorting  {0-9} then A-Z then a-z
		Collections.sort(l, in);

		System.out.println(l);
	}

}
