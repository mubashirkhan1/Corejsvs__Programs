package Mapprograms;

import java.util.HashMap;

public class Idendituhashmap {
	public static void main(String[] args) {
		Integer i=new Integer(10);
		Integer i1=new Integer(10);
		HashMap hm=new HashMap();
		hm.put(i, "mubashir");
		hm.put(11, "mubashir");//here one entry is add because duplicate entry not allow 
		System.out.println(hm);//old vaue change will nnew value jvm will cal equals method internaly
	}

}
