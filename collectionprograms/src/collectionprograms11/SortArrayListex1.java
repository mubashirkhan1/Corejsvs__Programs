package collectionprograms11;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListex1 {
	public static void main(String[] args) {
		
	
	ArrayList al=new  ArrayList();
	al.add("emaad");
	al.add("daud");
	al.add("cat");
	al.add("bilal");
	al.add("asim");
	Collections.sort(al);
	
		for(Object value:al)	
		{
			System.out.println(value);
		}
			// al. removeAll(al);
			// for(Object value:al)	
			// System.out.println(value);


	 
		System.out.println("sorting number");
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=10; i>=1;i--)
		{
			
	       l.add(i);
	       //Collections.sort(l);
	     
		}
		 Collections.sort(l);
		for(int num:l) {
			 System.out.println(num);
		}
		  System.out.println(l);
	    
	}
}
