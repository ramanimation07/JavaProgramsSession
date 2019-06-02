package com.exceptions;

public class MultipleCatchException {

	public static void main(String[] args) {

		try
		{
			int a[]=new int[10];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
