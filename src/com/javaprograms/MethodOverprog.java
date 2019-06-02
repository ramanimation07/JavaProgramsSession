package com.javaprograms;

public class MethodOverprog extends Methodover0prog{
	
	public int method2()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}

	public static void main(String[] args) {
		
		MethodOverprog obj=new MethodOverprog();
		int r=obj.method2();
		System.out.println(r);
		
	}

}
