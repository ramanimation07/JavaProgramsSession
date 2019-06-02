package com.stringsprog;

public class StringCompareprog {

	public static void main(String[] args) {
		
		String s1="Animation";
		String s2="ANIMATION";
		String s3="Movie";
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}
