package com.java;
class Medical extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("medical start");
			Thread.sleep(3000);
			System.out.println("complete medical");
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}	
	
}
class Testing extends Thread 
{
	public void run()
	{
		try
		{
			System.out.println("test start");
			Thread.sleep(5000);
			System.out.println("complete test");
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}	
	
}
class sign extends Thread 
{
	public void run()
	{
		try
		{
			System.out.println("sign start");
			Thread.sleep(1000);
			System.out.println("complete sign");
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}	
	
}

public class Licencedemo {
public static void main(String[] args) throws Exception
{ 
	Medical m=new Medical();
	m.start();
	m.join();
	Testing t=new Testing();
	t.start();
	t.join();
	sign s=new sign();
	s.start();
}
}
