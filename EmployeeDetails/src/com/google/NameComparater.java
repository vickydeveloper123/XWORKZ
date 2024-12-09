package com.google;

import java.util.Comparator;

public class NameComparater implements Comparator<EmployeeDetails> {

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
