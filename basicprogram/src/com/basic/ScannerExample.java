package com.basic;
import java.util.Scanner;

public class ScannerExample {
	int num,num1;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your first digits");
		int num=sc.nextInt();
		System.out.println("enter your first digits");
		int num1=sc.nextInt();
		for(int i=1; i<=10;i++)
		{
		System.out.println(i*num);
		if(i%2==0) {
			System.out.println(i);
		}
		}
		
	}

}
