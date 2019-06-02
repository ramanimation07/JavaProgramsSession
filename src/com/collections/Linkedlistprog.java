package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistprog {
	
	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ram");
		ll.add("Deva");
		ll.addFirst("Automation");
		ll.addLast("Testing");
		
		System.out.println("Content of String First" +ll);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("**************Using Iterator");
		
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
