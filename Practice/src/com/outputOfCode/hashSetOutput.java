package com.outputOfCode;

import java.util.HashSet;
import java.util.Set;

public class hashSetOutput {
int id;
String name;
	
	public hashSetOutput(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

	@Override
	public String toString() {
		return "hashSetOutput [id=" + id + ", name=" + name + "]";
	}
	
	

	public static void main(String[] args) {
		
		hashSetOutput sh1=new hashSetOutput(1, "sujay");
		hashSetOutput sh2=new hashSetOutput(1, "sujay");
		
		Set<hashSetOutput>s=new HashSet<hashSetOutput>();
		s.add(sh1);
		s.add(sh2);
		System.out.println(s);
		//as we are not overrding Hascode and Equals method it will consider both object aqs diffrent object
	
		
		
		
	}
}
