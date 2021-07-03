package com.basic;

public  class Costructorexample {
	public static void main(String[] args) {
		
	
			Costructorexample1 s=new Costructorexample1(1,"mubashir");

			s.m1();
			System.out.println("roll no from object   " +s.id+ "     name is from object " +s.name);
			
			
	}
		
		
	}

class Costructorexample12{
	Costructorexample12(){
		System.out.println("parents");
		//super();
	}
	void m2(){
		System.out.println("method of parents class");
	}
	
}

class Costructorexample1 extends Costructorexample12 {
	
	//Costructorexample1()
		int id;
		String name;
		Costructorexample1(int id,String name){
	//	super();
		this.id=id;
		this.name=name;
		System.out.println("roll no   " +id+ "     name is  " +name);
		System.out.println("child");
		
		}
		void m1() {
			super.m2();
			System.out.println("method of child");
		}
}
	

	

