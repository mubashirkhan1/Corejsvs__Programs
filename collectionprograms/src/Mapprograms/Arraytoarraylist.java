package Mapprograms;

import java.util.ArrayList;

public class Arraytoarraylist {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		for(int va:a) {System.out.println("by array:    "+va);}
		ArrayList<Integer> al=new ArrayList<Integer>();
		 for(int i=0;i<=a.length-1;i++) {
			 
			 al.add(a[i]);
		
		
		 }
		 System.out.println(al);
		  
		 for(int v:al) {
			// System.out.println("by arraylist    "+al);
		 
		 System.out.println("by arraylist    "+v);
	}}
}

