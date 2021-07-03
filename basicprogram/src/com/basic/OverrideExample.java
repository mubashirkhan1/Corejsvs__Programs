package com.basic;

  class OverrideExample {
  class A{
		 void show1() {
			System.out.println("mubashir");
		
		}
		
	}
	 void show11() {
		System.out.println("mubashir...........");
	 
	 {
		 
	 }
	}
	public static void main(String[] args) {
		OverrideExample	outer=new OverrideExample();//outer class object creation
		//OverrideExample.A inner=outer.new A();
		outer.show11();
	} 
 }
  class OverrideExample22 extends OverrideExample{
	 void show11() {
		 System.out.println("mubashirkhan zafer ahmed");
		
	}
		
	}


