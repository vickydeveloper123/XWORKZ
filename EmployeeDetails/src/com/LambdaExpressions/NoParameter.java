package com.LambdaExpressions;

interface Testing{
	
	public String runnable();
	
	
}


class NoParameter{
	public static void main(String[] args) {
		Testing tt=()->{return "Ilove u ";};
		
		tt.runnable();
	
		
		System.out.println(tt.runnable());
	}
}


  