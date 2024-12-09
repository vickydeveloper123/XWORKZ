package com.xworkz.factory;

import com.google.factory.PenFactory;

public class OppoFactory implements PenFactory   {
	
	public void phonePerformance() {
		System.out.println("Oppo performance is excellent in battery =====");
	}

	@Override
	public void manufacturingPens() {

		System.out.println("Accessing manufacturing pens from JAR FILES project");
	}

}
