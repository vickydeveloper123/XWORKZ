package com.LambdaExpressions;

interface Runnable{
	public String say(String name);
}

public class SingleParamter {
	public static void main(String[] args) {
		
		/*
		 * Runnable r=(name)-> { return "My bestie==="+name; };
		 * 
		 * System.out.println("Welcome ==="+r.say("Shwetha My Frined")); }
		 */
	
	
	Runnable rr=name->
	{
		return "Welcome to the jntua Portal"+name;
	};
	
	System.out.println(rr.say("	I love u"));
	
	
	

  
	

}
}
