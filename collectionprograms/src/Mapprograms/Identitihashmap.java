package Mapprograms;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Identitihashmap {
	public static void main(String[] args) {
		Integer i=new Integer(10);
		Integer i1=new Integer(10);
		IdentityHashMap hm=new IdentityHashMap();
		hm.put(i, "mubashir");
		hm.put(i1, "huzaifa");
		System.out.println(hm);
		System.out.println(hm.size());
	}

}



