package collectionprograms11;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetStringbufferwx {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new  Mycomparator());
		t.add(new StringBuffer("d"));
		t.add(new StringBuffer("y"));
		t.add(new StringBuffer("d"));
		t.add(new StringBuffer("p"));//if we doing our natyural sorting order not be nassecary to object comparabley
		t.add(new StringBuilder("c"));
		System.out.println(t);
		
	}

}
class Mycomparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}

}
