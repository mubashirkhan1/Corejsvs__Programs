package com.java;

public class A2 {
	public static void main(String args[]) {
		A3 f=new A3();
		f.m1();
		f.m2();
		
	}
}
	class A3 extends A4{
	void m1() {
		System.out.println("hello");
	}
		
	
	}
	class A4 {
		void m2() {
			System.out.println("hello .......");
		}
			
		
		}

