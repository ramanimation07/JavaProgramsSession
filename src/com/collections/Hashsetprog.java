package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetprog {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();
		hs.add("Ram");
		hs.add("Krish");
		hs.add("Ram");
		
		System.out.println("Content of Set String " +hs);
		
	System.out.println("Using For Loop");
	
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
