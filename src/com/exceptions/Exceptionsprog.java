package com.exceptions;

public class Exceptionsprog {

	public static void main(String[] args) {

		try {
			int number = 100 / 0;

		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Program Run");

		}
	}

}
