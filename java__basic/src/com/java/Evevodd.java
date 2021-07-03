package com.java;

public class Evevodd {
	public static void main(String[] args) {
	
	int no=10, s2=no/2,s,count=1,count2=2;
	for(int i=1;i<=10; i++)
	{
		if(i<=s2)
		{
		 System.out.print(count);
		 if(i !=s2)
		 {
			 System.out.print(",");
		 }
		 else {
			 System.out.print(" ");
		 }
		 count+=2;
		 if(i==s2)
		 {
			 System.out.println();
		 }
		}else {
			System.out.print(count2);
			
			 if(i !=10 )
			 {
				 System.out.print(",");
				
			 }
			 else {
				 System.out.println("  ");
			 }
			
			 count2+=2;
			
		}
		
		
	}
	}
		
	
	

}
