package com.basic;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylistandlinkedlistexample {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(3);
	al.add(3);
	al.add(6666);
	al.add(3);
	al.add(3);
	al.remove(2);
	System.out.println(al);
	
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("mubashir1");
	ll.add("mubashir3");
	ll.add("mubashir4");
	ll.remove(1);
	System.out.println(ll);
	System.out.println(ll.getClass().getName());
	
	}
}
