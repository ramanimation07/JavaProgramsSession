package com.javaprograms;

public class Arrayconcepts {

	public static void main(String[] args) {

		int i[] = new int[2];
		i[0] = 10;
		i[1] = 20;
		System.out.println(i[0]);

		System.out.println(i.length);

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	}

}
