package com.basic;

public class Array1to30 {
	public static void main(String[] args) {
	 int []a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
	 for(int i=1;i<=a.length-1;i++)
	 {  
		  if((a[i]%3==0 )&& (a[i]%5==0) ){
			 System.out.println(a[i] +"i like both");
		  }
			 else if(a[i]%3==0) {
		 System.out.println(a[i] +"       i like tea only");
			 }
		 else if(a[i]%5==0) { System.out.println(a[i] +"       i like coffee only");}
		
		  		
		
	}

}}
