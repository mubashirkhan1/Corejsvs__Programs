package com.java;

import java.util.Vector;
import java.util.Enumeration;

public class Enumerationexample {

public static void main(String[] args) {
	Vector v=new Vector();
	//Enumeration e=v.elements();
	for(int i=0; i<=10;i++)
	{
		v.addElement(i);
		//
		//System.out.println(v);
	}

	Enumeration e=v.elements();
	while(e.hasMoreElements());
	
	{

		 Integer h=(Integer) e.nextElement();
		 if(h%2==0)
	 {
	 
	   System.out.println(h);
	 }
	 
	}
	
}
}


