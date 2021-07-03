package com.basic;

    class Constructorcalling {
  	  Constructorcalling()
  	 	{
  	 		 System.out.println("parents class constructor");
  	 	}
  			void m2() {
  				System.out.println("qwertyhjhgfdfghjkjhgf");
  			}
  		
	public static void main(String[] args) {
		//static int a;
		//System.out.println(a);
		Constructorchild child=new Constructorchild();
		child.m1();
	 
		
	}

}
 class Constructorchild extends Constructorcalling {
	  short a;
	//System.out.println(a);
	 void m2() {
			System.out.println(a);
		}
	 void m1() {
		// super();	 super.m2();
		 super.m2();
		 System.out.println("m1 method");
		m2();
	 }
	 Constructorchild(){
		 System.out.println("child construct");
 }
}