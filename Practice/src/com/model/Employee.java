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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((dateOfJoining == null) ? 0 : dateOfJoining.hashCode());
		result = prime * result + eId;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + ((phoneNmuber == null) ? 0 : phoneNmuber.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (dateOfJoining == null) {
			if (other.dateOfJoining != null)
				return false;
		} else if (!dateOfJoining.equals(other.dateOfJoining))
			return false;
		if (eId != other.eId)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (phoneNmuber == null) {
			if (other.phoneNmuber != null)
				return false;
		} else if (!phoneNmuber.equals(other.phoneNmuber))
			return false;
		if (salary != other.salary)
			return false;
		return true;
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
