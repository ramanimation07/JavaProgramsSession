package com.javaprograms;

public class Callbyvalueandrefprog {
	public int method1(int a,int b)
	{
		int c=a+b;
		return c;
		
	}

	public static void main(String[] args) {
		Callbyvalueandrefprog obj=new Callbyvalueandrefprog();
		int x=10;
		int y=10;
		
		obj.method1(30, 40);
		

	}

}
