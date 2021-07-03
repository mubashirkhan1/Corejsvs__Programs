package collectionprograms11;

import java.util.TreeSet;

public class Treesetex2 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("Z");
		t.add("A");
		t.add("P"); //inter nallly compare to method call becuse of natural sorting order first element is root elemnt {A,P,Z}
		System.out.println(t);
	}

}
