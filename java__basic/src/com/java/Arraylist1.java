
package com.java;
import java.util.*;
public class Arraylist1 {
	public static void main(String[] args) {	
	ArrayList a=new ArrayList();
	a.add("b");
	a.add(18);
	a.add("c");
	a.add(null);
	System.out.println(a);
	a.remove(1);
	System.out.println(a);
	a.add(0,"m");
	a.add("n");
	System.out.println(a);
	}
}
