package collectionprograms11;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetexStringandbuffer {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new Mycomparater1());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		//t.add(new StringBuffer("zoo"));
		t.add("A");
		//t.add("bo");
		//t.add("zaba");
		//t.add(new StringBuffer("bo"));
		System.out.println(t);
		
	}

}
class Mycomparater1 implements Comparator
{ public int compare(Object o1,Object o2 )
	{
	  String s1=o1.toString();
	  String s2=o2.toString();
	 int l1=s1.length();
	 int l2=s2.length();
	 if(l1<l2) {return -1;}
	 if(l1<l2) {return 1;}
	 else{return s1.compareTo(s2); }
	}
	
}
