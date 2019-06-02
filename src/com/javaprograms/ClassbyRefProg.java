package com.javaprograms;

public class ClassbyRefProg {
	int p;
	int q;

	public static void main(String[] args) {
		ClassbyRefProg obj = new ClassbyRefProg();
		obj.p = 50;
		obj.q = 100;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);

	}

	public void swap(ClassbyRefProg t) {
		
		int temp;
		temp= t.p;
		t.p=t.q;
		t.q=temp;
		

	}

}
