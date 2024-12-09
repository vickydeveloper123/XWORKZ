package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRunner {

	public static void main(String[] args) {

		EmployeeDetails employee1 = new EmployeeDetails(10, 15000, 25, "vishnu", new Address("BTM", 524004));
		EmployeeDetails employee2 = new EmployeeDetails(9, 12000, 24, "nEELESH", new Address("hindupur", 535304));
		EmployeeDetails employee3 = new EmployeeDetails(11, 12400, 23, "manujunath", new Address("silkboard", 434304));
		EmployeeDetails employee4 = new EmployeeDetails(12, 153400, 27, "shahi", new Address("RajajiNagar", 3443434));
		EmployeeDetails employee5 = new EmployeeDetails(01, 12420, 22, "shwetha", new Address("MG Road", 524004));// 22, 23, 24 ,25,27

		List<EmployeeDetails> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);

		System.out.println("Employee Details ==>" + list);
		
		System.out.println("Sorting the Employee Data based on the Ages");
		
		Collections.sort(list,new IDcompater());
		System.out.println("Sorted =="+list);
		
		System.out.println("Sorted based on Names");
		
		Collections.sort(list, new NameComparater());
		
		System.out.print("Names Assigned in a proper Way"+list);

	}

}
