package com.javaprograms;

public class NonStaticmethodprog {

	public static void main(String[] args) {
		NonStaticmethodprog obj = new NonStaticmethodprog();
		obj.method1();
		int sum = obj.method2();
		System.out.println(sum);
		String nam = obj.method3();
		System.out.println(nam);

	}

	public void method1() {
		System.out.println("First Method ");
	}

	public int method2() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public String method3() {
		String name = "Ram";
		return name;
	}

}
