package com.xworkz.factory;

import com.google.factory.PenFactory;

public class PhoneTester {
	
	public static void main(String[] args) {
		
		PenFactory pen=new OppoFactory();
		pen.manufacturingPens();
		
		OppoFactory oppo=new OppoFactory();
		oppo.phonePerformance();
		oppo.manufacturingPens();
		
		System.out.println("Now we are going to run the another class object imprting ");
		
		try {
			Class.forName("com.xworkz.factory.OppoNewFeatures");
		} catch (ClassNotFoundException e) {

			
			e.printStackTrace();
		}
		
		
	}

}
