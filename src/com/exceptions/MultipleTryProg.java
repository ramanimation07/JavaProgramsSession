package com.exceptions;

public class MultipleTryProg {
	public static void main(String[] args) {
		try {
			try {
				int number = 100 / 0;
			} catch (ArithmeticException e) {

				System.out.println(e);
				System.out.println("Code Excecuted");
			}
			try {
				int a[] = new int[10];
				System.out.println(a[10]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("2 Code Executed");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
