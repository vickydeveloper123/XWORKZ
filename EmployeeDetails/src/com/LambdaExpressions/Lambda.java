package com.LambdaExpressions;

interface Drawable{
	
	public void drawing();
	
	
}

class Lambda{
	
	public static void main(String[] args) {
		
		int NumberOfPenPencils;
		String paintingSet;
		
		Drawable drawing=()->System.out.println("NoOfPencils"+10+" SetName"+"GoodPainter");
		
		drawing.drawing();
	}
	
	
}