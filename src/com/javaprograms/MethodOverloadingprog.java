package com.javaprograms;

public class MethodOverloadingprog {
	
	public void aero1()
	{
		System.out.println("Emirates");
	}
	public void aero1(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		MethodOverloadingprog obj=new MethodOverloadingprog();
		obj.aero1();
		obj.aero1(10, 50);

	}

}
