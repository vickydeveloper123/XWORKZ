package com.google;

import java.util.Comparator;

public class IDcompater implements Comparator<EmployeeDetails>{

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {

		return o1.getAge()-o2.getAge();
		
		
	}

}
