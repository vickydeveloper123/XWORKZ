package com.google;

import java.util.Comparator;

public class Address implements Comparator<Address> {

	private String streetName;
	private int pincode;

	public Address() {

		System.out.println("Address is running");
	}

	public Address(String streetName, int pincode) {
		super();
		this.streetName = streetName;
		this.pincode = pincode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pincode=" + pincode + "]";
	}

	@Override
	public int compare(Address o1, Address o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
