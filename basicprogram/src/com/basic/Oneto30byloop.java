package com.basic;

public class Oneto30byloop {
	public static void main(String[] args) {
		for(int i=1; i<=30;i++)
		{
			 if(i%5==0) {
				System.out.println(i+" I LIKE ONLY COFEE");	
			
			}
			else if(i%3==0){
				System.out.println(i+"     I LIKE ONLY TEA");
				
			}
			 if(i%3==0 && i%5==0) {
				System.out.println(i+"     I LIKE BOTH");
			
			}
		}
		
	}

}
