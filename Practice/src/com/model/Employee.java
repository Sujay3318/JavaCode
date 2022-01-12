package com.model;

import java.util.Date;
import java.util.List;

public class Employee {

	private int eId;
	private String eName;
	// Date from util package
	private Date dateOfJoining;
	private Address address;
	private long salary;
	// List import from util package
	private List<Long> phoneNmuber;

	public Employee(int eId, String eName, Date dateOfJoining, Address address, long salary, List<Long> phoneNmuber) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.dateOfJoining = dateOfJoining;
		this.address = address;
		this.salary = salary;
		this.phoneNmuber = phoneNmuber;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", dateOfJoining=" + dateOfJoining + ", address=" + address
				+ ", salary=" + salary + ", phoneNmuber=" + phoneNmuber + "]";
	}

	public List<Long> getPhoneNmuber() {
		return phoneNmuber;
	}

	public void setPhoneNmuber(List<Long> phoneNmuber) {
		this.phoneNmuber = phoneNmuber;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
