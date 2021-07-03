package com.basic;
  class Oter1{
	  int i,j;
	  Oter1(int i,int j){
		  this.i=i;
		  this.j=j;
		  int c=i-j;
		  System.out.println(c);
		  
	  }
	  void show3() {
		int a=2;
		int b=3;
		System.out.println(a+b);
		  
	  }
    class Inn{
		void m1() {
			System.out.println("mubashir");
		} 
	 }
 }
   public class Inner1 {
	   public static void main(String[] args) {
		Oter1 o=new Oter1(50,90);
		o.show3();
		Oter1.Inn i=o.new Inn();
		i.m1();
	}

}
