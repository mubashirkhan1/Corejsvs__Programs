package com.java;

public class Pattern1 extends Thread{
	public void run() 
	{
		Thread.yield();
		 for(int i=1; i<=5; i++)
		 {
		System.out.println(Thread.currentThread().getName()+ " "+i);
		 }
	}
		public static void main(String[] args) {
			Pattern1 p=new Pattern1();
			p.start();
			//Thread.yield();
			Pattern1 p1=new Pattern1();
			p1.start();
			
			 for(int i=1; i<=5; i++)
			 {
					System.out.println(Thread.currentThread().getName()+ " "+i);
				 
			 }
			
		}
		
			
		}
	


