package com.shan.sample.person;

//import org.apache.commons.lang3.StringUtils;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age < 0 || age > 100  ? 0 : age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFullName() {
		return (firstName + " " + lastName).trim();
	}
	
	public boolean isTeen() {
		return age >= 13 && age < 20 ? true : false;
	}
	
}
