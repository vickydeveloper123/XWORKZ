package com.LambdaExpressions;

interface Validation{
	int Running(int name,int salary);
}
public class MultipleParameters {
	
	public static void main(String[] args) {
		
		
		Validation vv=(a,b)->(a+b);
		System.out.println(vv.Running(575, 2323));
		
		Validation vv1=(int a,int b)->(a+b);
		System.out.println(vv.Running(575, 2323));
		
		
		Validation vv11=(int a,int b)->{return (a+b);};
		System.out.println(vv11.Running(575, 2323));
		
		
	}

}
