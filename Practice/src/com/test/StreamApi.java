package com.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

import com.model.Address;
import com.model.Employee;

//unit testing required this much knowledge
public class StreamApi {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		List<Long> phoneNumbers = new ArrayList<Long>();
		phoneNumbers.add(0, (long) 12411214);
		phoneNumbers.add(1, (long) 1354164);

		/**
		 * object intialization most important in case of unit testing as we pass
		 * dummmy records or according to which we know the output according to input
		 * that things we pass in object . so object initialization is important
		 */
		Employee emp1 = new Employee(1, "sujay", new Date(), new Address(52, "pali", 40000), 330000,
				new ArrayList<Long>());
		Employee emp2 = new Employee(2, "jay", new Date(), new Address(52, "pali", 407373), 250000, phoneNumbers);

		/**
		 * date time api in java 8 feature
		 */
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("current date" + dt);
		System.out.println("day out of 1-31 " + dt.getDayOfMonth());// it will return 1 to 31 date
		System.out.println("year " + dt.getYear());// it will return year
		System.out.println("month 1-12 " + dt.getMonthValue());// it will return month

		System.out.println("Current date + 12days " + dt.plusDays(12));
		System.out.println("current date year +2 year" + dt.plusYears(2));

		empList.add(emp1);
		empList.add(emp2);

		System.out.println(empList.get(0));
		System.out.println(empList.get(1));

		Predicate<Employee> p = (t) -> {
			if (t.getSalary() > 5000) {
				return true;
			} else {
				return false;
			}
		};

		/**
		 * 
		 * basic is stream never store the data and perform operations employee list
		 * type is Employee so t variable will be contain employee object so employee
		 * object on that perform operations
		 * 
		 */
		System.out.println("show the employee whose name is sujay ->");

		/**
		 *
		 * filter take predicate which has test() method and for each take consumer
		 * filters ->according to predicate it returns the stream
		 * 
		 */
		empList.stream().filter(t -> t.geteName() == "sujay").forEach(t -> System.out.println(t));

		/**
		 * map return stream according to the function we applied
		 * 
		 */
		List<Integer> list = Arrays.asList(3, 6, 9, 12);
		System.out.println("Find out cubes of the given integer list");
		list.stream().mapToInt(t -> t * 3).forEach(System.out::println);

		for (Employee emp : empList) {
			if (p.test(emp)) {
				System.out.println(emp.geteName());
			}
		}

	}

}
