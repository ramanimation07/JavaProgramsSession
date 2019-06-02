package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistprog {

	public static void main(String[] args) {

		ArrayList obj = new ArrayList();
		obj.add("Ram");
		obj.add("Automation");
		obj.add(123);

		System.out.println(obj.size());
		System.out.println(obj.get(2));
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i));
		}

		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(456);
		System.out.println(obj1.get(0));

		Employee e1 = new Employee(01, "Ram", "Krishna Nagar");
		Employee e2 = new Employee(02, "Dinesh", "Thiruvanmiyur");
		
		ArrayList< Employee> obj2=new ArrayList<Employee>();
		
		obj2.add(e1);
		obj2.add(e2);
		
		Iterator<Employee> it=obj2.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.address);
			
			
		}
		
		

	}
}
