package com.basic;

public class Selectionsort {

	public static void main(String[] args) {
		int  a[]= {5,6,2,3,1,-1};
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{ int min=i;
		 for(int j=i; j<n;j++)
		 {
			if(a[j]<a[min]) {
				min=j;
			}
		 }
			int temp =a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		// for(int i=1; i<a.length-1; i++)
		   for(int value: a)
		 {
			 
			 System.out.print(value +"  ");
		 }
		// TODO Auto-generated method stub

	}

}
