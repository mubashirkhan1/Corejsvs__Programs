package com.java;

import java.util.Comparator;
import java.util.TreeSet;

public class Treesetcostamizesortingorderbycomparator {
	public static void main(String[] args) {
		
	
	TreeSet t=new TreeSet(new costamizecomparator());
	t.add(6);
	t.add(0);
	t.add(1);
	t.add(13);
	t.add(11);
	t.add(8);	
	t.add(7);	
	t.add(18);
   t .add(18);
	System.out.println(t);
	
	}
}
class costamizecomparator implements Comparator
{
	public int compare(Object obj1,Object obj2) {
		Integer s1=(Integer)obj1;
		Integer s2=(Integer)obj2;
	//	return -s1.compareTo(s2);
		return +1;
	/*	if(s1<s2)
		{
			return +1;
		}
		else if(s1>s2)
		{
			return -1;
		}else {return 0;}*/
	}

}
