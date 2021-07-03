package com.java;
import java.util.*;
public class Linkedlistdemo {
	public static void main(String[] args) {
		
	LinkedList l=new LinkedList(Arrays.asList("sADSDS","FERGFR"));
	l.add("mubashir");
	l.add(10);
	l.add("khan");
	l.add(null);
	System.out.println(l);
	l.set(0 ,"affan");
	System.out.println(l);
	l.add(0 ,"akhlaq");
	System.out.println(l);
	l.removeLast();
	System.out.println(l);
	l.addFirst("zafar");
	System.out.println(l);
	Iterator itr=l.iterator();
	while(itr.hasNext())
	
	System.out.println(itr.next());
	}
}
