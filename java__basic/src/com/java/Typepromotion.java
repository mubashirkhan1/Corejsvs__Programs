package com.java;
class Typepromotion1
{
 
		  void sum(int a,long b)
		  {
			  System.out.println("hi");
			  }  
		  void sum(long a,int b,int c)
		  {
			  System.out.println("heloo");
			  }  
		  
		  
		  
}
public class Typepromotion {
	public static void main(String args[]){  
		Typepromotion1 obj=new Typepromotion1();  
		  obj.sum(20,28);//now second int literal will be promoted to long  
	//	  obj.sum(20,20,20);  
		  
		  }  

}
