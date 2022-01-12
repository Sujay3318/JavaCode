package com.model;

public class Address {
	private int plotNumber;
	private String pathName;
	private int pinCode;

	public int getPlotNumber() {
		return plotNumber;
	}

	public void setPlotNumber(int plotNumber) {
		this.plotNumber = plotNumber;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public Address(int plotNumber, String pathName, int pinCode) {
		super();
		this.plotNumber = plotNumber;
		this.pathName = pathName;
		this.pinCode = pinCode;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [plotNumber=" + plotNumber + ", pathName=" + pathName + ", pinCode=" + pinCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pathName == null) ? 0 : pathName.hashCode());
		result = prime * result + pinCode;
		result = prime * result + plotNumber;
		return result;
	}

//Hashcode and Equals contract clt+shift+f
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (pathName == null) {
			if (other.pathName != null)
				return false;
		} else if (!pathName.equals(other.pathName))
			return false;
		if (pinCode != other.pinCode)
			return false;
		if (plotNumber != other.plotNumber)
			return false;
		return true;
	}

}
