package com.java;

import java.util.Comparator;
import java.util.TreeSet;

public class Treesetwithcostimizewithcomparable {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(1);
		t.add(5);
		t.add(3);
		t.add(4);
		t.add(2);
		t.add(2);
		System.out.println(t);
		/*TreeSet t1=new TreeSet(new Userdefinecomparable() );
		t1.add(new StringBuffer("mubashir"));
		t1.add(new StringBuilder("khan"));
		t1.add("don");
		t1.add(3);
		t1.add("A");
		//System.out.println(t1);*/
		TreeSet t3=new TreeSet(new Userdefinecomparable());
		t3.add("A");
		t3.add("AgfA");
		t3.add("bb");
		t3.add("cc");
		t3.add("g");
		t3.add("hdh4");
		System.out.println(t3);
		
	}

}
class Userdefinecomparable implements Comparator
{
	public int compare(Object obj1,Object obj2) {
		String s3= obj1.toString();
		String s4= obj2.toString();
		int l1=s3.length();
		int l2=s4.length();
		//return l1.compareTo(l2);
		if(l1<l2) {return -1; }
		else if(l1>l2) {return +1; }
		else {return s3.compareTo(s4);}
		
	}

}
