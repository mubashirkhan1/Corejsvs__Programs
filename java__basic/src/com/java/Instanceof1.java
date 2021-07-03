package com.java;
public  class Instanceof21
{ 
	 protected Instanceof21() 
		 {
			System.out.println("hi");
		}
	  public static void main(String[] args) 
	  {
		
}
}

 
 class Instanceof1 extends Instanceof2 {
	 public static void main(String[] args) {
		 Instanceof2 d=new Instanceof1();
		 System.out.println(d instanceof Instanceof2);
		
	}

}
