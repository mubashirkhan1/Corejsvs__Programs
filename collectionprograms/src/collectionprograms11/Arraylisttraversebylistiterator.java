package collectionprograms11;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylisttraversebylistiterator {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("january");
		al.add("febuary");
		al.add("march");
		al.add("APRIL");
		ListIterator litr=al.listIterator();
		while(litr.hasNext());
		{
		  String s=(String) litr.next()	;
		  System.out.println(s);
		}
		System.out.println("hjsjkbjvsj");
	}

}
