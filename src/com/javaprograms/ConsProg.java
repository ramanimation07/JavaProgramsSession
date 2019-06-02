package com.javaprograms;

public class ConsProg {

	int id;
	String name;

	ConsProg(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		ConsProg obj = new ConsProg(10, "Automation");
		System.out.println(obj.id);
		System.out.println(obj.name);

	}

}
