package com.google;

import java.util.Comparator;

public class EmployeeDetails implements Comparator<EmployeeDetails>{

	private int id;
	private int salary;
	private int age;
	private String name;
	private Address address;

	public EmployeeDetails() {

		System.out.println("Running EmployeeDetails sucessfully");// For creating object
	}

	public EmployeeDetails(int id, int salary, int age, String name, Address address) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", salary=" + salary + ", age=" + age + ", name=" + name + ", address="
				+ address + "]";
	}

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
