package com.java;

public class Tostring1 {
	String name;
	int id;

	Tostring1 (String n,int i){
		id=i;
		name=n;
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {
		 Tostring1 t=new  Tostring1 ("ygyu",78);
		 System.out.println(t);
		
	}
}
