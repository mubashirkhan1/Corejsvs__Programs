package com.basic;

import java.util.*;

public class Listexam {
	public static void main(String[] args) {
		Vector l=new Vector (10,2);
		System.out.println(l.capacity());
		for(int i=1; i<=10; i++)
		{
			l.addElement(i);
		} 	System.out.println(l);
		System.out.println(l.capacity());
		l.addElement("mubashir");
		System.out.println(l.capacity());
		System.out.println(l);
		
	}

}
