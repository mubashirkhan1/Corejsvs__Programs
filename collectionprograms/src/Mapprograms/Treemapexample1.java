package Mapprograms;

import java.util.TreeMap;

public class Treemapexample1 {
	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		t.put(100, "mmm");
		t.put(102, "pppp");
		t.put(100, "g");
		t.put(103, "h");
		t.put(123, "mmm");
	//	t.put("rrff", "7777"); clASS CAST EXCEPTION IF WE DEPEND ON NATURAL SORTING ORDER and ake hetrogeneous elements
		System.out.println(t);
	}

}
