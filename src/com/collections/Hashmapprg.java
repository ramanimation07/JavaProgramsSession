package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmapprg {

	public static void main(String[] args) {
	
		HashMap<Integer, String> str=new HashMap<Integer, String>();
		str.put(1, "Selenium");
		str.put(2, "Automation");
		
		System.out.println(str.get(1));
		
		for(Entry m:str.entrySet())
		{
			System.out.println(m.getKey() +" "+m.getValue());
		}
		System.out.println("++++++++++++++");
		
		System.out.println(str);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^");
		
		HashMap<Integer, Employee> str1=new HashMap<Integer, Employee>();
		
		Employee e1=new Employee(01, "Ram", "Thiruvanmiyur");
		Employee e2=new Employee(02, "Peter", "Taramani");
		
		str1.put(1, e1);
		str1.put(2, e2);
		
		for(Entry <Integer, Employee> m : str1.entrySet())
		{
			int key =m.getKey();
			Employee e=m.getValue();
			System.out.println(key +"  "+ "Info");
			System.out.println(e.id+ " "+e.name+ " "+ e.address);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
