package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

import com.model.Address;
import com.model.Employee;

public class StreamApi {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee(1, "sujay", new Date(), new Address(52, "pali", 40000), 330000,
				new ArrayList<Long>());
		Employee emp2 = new Employee(2, "jay", new Date(), new Address(52, "pali", 407373), 250000,
				new ArrayList<Long>());

		empList.add(emp1);
		empList.add(emp2);

		System.out.println(empList);

		Predicate<Employee> p = (t) -> {
			if (t.getSalary() > 5000) {
				return true;
			} else {
				return false;
			}
		};

		for (Employee emp : empList) {
			if (p.test(emp)) {
				System.out.println(emp.geteName());
			}
		}

	}

}
