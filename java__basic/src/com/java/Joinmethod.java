package com.java;

public class Joinmethod extends Thread {
	static Thread mainthread;
public void run()
{    try {
	for(int i=1; i<=5; i++)
	{ 	mainthread.join();
		System.out.println("child thread  :   "+i);
		Thread.sleep(1000);
	
	}
	}
	catch(Exception e)
{
		System.out.println(e);		
}		
		
	}
		public static void main(String[] args)  throws InterruptedException {
			mainthread= Thread.currentThread();
			Joinmethod j=new Joinmethod();
			j.start();
			//j.join();
		
			 try {
					for(int i=1; i<=5; i++)
					{ 
					System.out.println("main thread  :  "+i);
					Thread.sleep(1000);
					}
					}
					catch(Exception e)
				{
						System.out.println("hello");
					
                }
			 			
		}
}
		
		


