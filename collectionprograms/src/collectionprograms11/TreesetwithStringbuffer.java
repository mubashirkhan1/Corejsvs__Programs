package collectionprograms11;

import java.util.TreeSet;

public class TreesetwithStringbuffer {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add( new StringBuffer("A"));
		ts.add( new StringBuffer("Z"));
		ts.add( new StringBuffer("B"));
		ts.add( new StringBuffer("B"));
		ts.add(new StringBuilder('M'));
		System.out.println(ts);
		
	}

}
 