package com.basic;
import java.util.Scanner;
public interface Tablebyuser2 {
	void m1();
	public static void main(String[] args) {
		//int s;
		Tablebyuser33 s1=new Tablebyuser33();
		 s1.m1();		
		}

	}
	class Tablebyuser33 implements Tablebyuser2
	{ int n,t;
		public void m1() {
			
			Scanner s=new Scanner(System.in);
			System.out.println("enter your table");
			n=s.nextInt();
			for(int i=1; i<=10; i++)
			{
				//System.out.println(i*n);
				 t= i*n;
				
				if(t%2!=0)
				{
					System.out.println(t+"   odd number from table");
				}
				else {
					System.out.println(t+"   even no from table");
					
				}
				System.out.println(t);
				
			}
		}

	}


