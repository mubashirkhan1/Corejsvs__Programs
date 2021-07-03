package collectionprograms11;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Listsortingexample {
	public static void main(String[] args) {
		List<String> l=new ArrayList();
		l.add("kpple");
		l.add("dpple");
		l.add("bpple");
		l.add("apple");
		for(String v:l)
		{
			System.out.println("befor sorting "+""+v);
		}
		Collections.sort(l);
		for(String k:l)
		System.out.println("after sorting "+""+k);
		System.out.println(l.get(2));
		l.set(1, "element");
		System.out.println(l);
	}


}
