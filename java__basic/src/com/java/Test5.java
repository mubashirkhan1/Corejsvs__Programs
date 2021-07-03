package com.java;

interface A{  
abstract void a();  
void b();  
void c();  
void d();  
}  
  

class M implements A{ 
	public void c(){System.out.println("I am cccc");}  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
class Test5{  
public static void main(String args[]){  
A a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}
}