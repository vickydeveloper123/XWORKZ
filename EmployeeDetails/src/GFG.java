

class workkkk{
	public static void main(String[] args) {
		
		Adding add=(a,b,c)->(a+b-c);
		System.out.println(add.add(1, 3, 5));
		
		Adding addd=(int a,int b,int c)->{return (a+b-c);};
		System.out.println(add.add(12, 44, 56));
		
	}
}

interface Adding{  
    int add(int a,int b,int c);  
}  
