package com.javaprograms;

public class ClassandObjProg {

	// Class Variables

	int aeronum;
	String model;

	public static void main(String[] args) {

		ClassandObjProg obj1 = new ClassandObjProg();
		ClassandObjProg obj2 = new ClassandObjProg();
		ClassandObjProg obj3 = new ClassandObjProg();

		obj1.aeronum = 647;
		obj2.aeronum = 474;
		obj3.aeronum = 363;
		obj1.aeronum = 777;

		System.out.println(obj1.aeronum);

	}

}
