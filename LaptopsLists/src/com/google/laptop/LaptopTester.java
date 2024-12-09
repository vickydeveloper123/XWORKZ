package com.google.laptop;


public class LaptopTester {
	public static void main(String[] args) {
		
		
		Laptop lp=new Laptop() {
			
			@Override
			public void LatopInformation() {

				System.out.println("KSJBKDSBKSDB");
			}
			
			@Override
			public void LaptopSpecifications() {

				System.out.println("kjsabcadgsfijdas");
			}
		};
		
		HpLaptop hp=new HpLaptop();
		hp.LaptopSpecifications();
		hp.LatopInformation();
		hp.method();
		
		LenovaLaptop hpte=new LenovaLaptop();
		
		try {
			Class.forName("com.google.laptop.LenovaLaptop.java");
		} catch (ClassNotFoundException e) {

			System.out.println("shdjsdgisdg");
			e.printStackTrace();
		}
		
	}

}
