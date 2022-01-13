package com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.model.Address;
import com.model.Employee;

public class HashCodeEqualsContract {

	public static void main(String[] args) {

		String s1 = new String("abc"); // two object will get created
		// one object in heap are and other inside heap area there is string constant
		// pool area

		String s2 = new String("pqr").intern(); // basically use to save memory and 1 object will get created
		// which is in string constant pool area

		String s3 = "xyz"; // 1 object get created string literal get store in string constant pool area

		String s4 = "xyz"; // no object will get created as "xyz" is already present in string constant
							// pool area

		// when two object are same then their hashCode will be same hashCode same means
		// reference pointing to same object
		System.out.println(s3.hashCode() == s4.hashCode());

		// hasCode try's to generate different hashCode for each object some time it
		// might be equal even two object are different

		// as we change a single things from string that measn new object get created in
		// string contstant pool area
		// as string is immutable
		String s5 = s4.toUpperCase();
		// as hashCode is different is the proof
		System.out.println(s4.hashCode() == s5.hashCode());

		// String is immutable as we try to concatenate new string will get created
		String s6 = s4 + "abc";

		List<Long> phoneNumbers = new ArrayList<Long>();
		phoneNumbers.add(0, (long) 12411214);
		phoneNumbers.add(1, (long) 1354164);
		Address adr = new Address(52, "pali", 40000);
		Date dt = new Date();
		Employee emp1 = new Employee(1, "sujay", dt, adr, 330000, phoneNumbers);
		Employee emp2 = new Employee(1, "sujay", dt, adr, 330000, phoneNumbers);

		// System.out.println(emp1.hashCode() == emp2.hashCode());//this will give false
		// as i have not override the thinngs

		// after overriding of hashCode and equals this will return true value
		System.out.println(
				"Equals of two same object after overriding the hascode anmd equals Output;->" + emp1.equals(emp2));

		System.out.println(emp1.hashCode() == emp2.hashCode());

	}

}
