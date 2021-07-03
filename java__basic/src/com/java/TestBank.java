package com.java;
abstract class Bank{    
abstract int getRateOfInt();
abstract int getRateOfInteger();
}    
class SBI extends Bank{    
int getRateOfInt(){return 7;} 
int getRateOfInteger(){return 7;}
}    
class PNB extends Bank{    
	int getRateOfInt(){return 8;} 
	int getRateOfInteger(){return 8;}
	}       
    
class TestBank{    
public static void main(String args[]){    
Bank b;  
b=new SBI();  
 
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInt()+" %");   
System.out.println("Rate of Interest is: "+b.getRateOfInteger()+" %");    
}}    