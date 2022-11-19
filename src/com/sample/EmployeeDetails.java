package com.sample;

public class EmployeeDetails {
// project - package - class - method - mainmethod - object
	// how to create method

	// method
	private void empName() {

		System.out.println("Employee name is codfis");

	}

	// method
	private void empAddress() {

		System.out.println("Employee address is 1234 street");
	}

	// mainmethod
	public static void main(String[] args) {

		// object creation syntax
		// classname objectrefname = new Classname();

		EmployeeDetails e = new EmployeeDetails();

		// to call a method
		// objectrefname.methodname
		e.empName();
		e.empAddress();

	}

}
