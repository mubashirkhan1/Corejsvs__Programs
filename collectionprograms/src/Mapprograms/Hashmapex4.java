package Mapprograms;

import java.util.HashMap;
import java.util.Map;

public class Hashmapex4 {
	public static void main(String[] args) {
		HashMap <Integer,String>hm=new HashMap();
		hm.put(3, "mubashihr");
		hm.put(1, "umar");
		hm.put(4, "akhlaq");
		hm.put(2, "bilal");
		hm.put(1, "umar1");
		System.out.println(hm);
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}

}
