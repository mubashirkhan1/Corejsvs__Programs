package com.java;

public abstract class Bike1 {
	
abstract void  run();
public static void main(String[] args) {
	Bike1 f=new Bike2();
	f.run();
}
}

class Bike2 extends Bike1{
	void run(){System.out.println("Running-----");}
}
 
