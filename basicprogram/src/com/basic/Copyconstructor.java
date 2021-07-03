package com.basic;

 class Copyconstructor1 {
	int id;
	String name;
	Copyconstructor1(int a,String b)
	{
		id=a;
		name=b;
		
	}
	Copyconstructor1()
	{//id=s.id;
      //name=s.name;
      
	}
	
	void m1() {
		System.out.println(id+" " +name);
	}
}
	class Copyconstructor{
		
	public static void main(String[] args) {
		
	
	Copyconstructor1 c=new Copyconstructor1 (101,"mubashir");
	Copyconstructor1 c1=new Copyconstructor1();
	c1.id=c.id;
	c1.name=c.name;
	 c.m1();
	 c1.m1();
	}
}
