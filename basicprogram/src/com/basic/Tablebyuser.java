package com.basic;
import java.util.Scanner;

public interface Tablebyuser {
	void m1();
	public static void main(String[] args) {
		Tablebyuser1 s1=new Tablebyuser1();
		 s1.m1();
	}

}
class Tablebyuser1 implements Tablebyuser
{ int n;
	public void m1() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter your table");
		n=s.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(i*n);
		}
	}

}
