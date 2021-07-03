package collectionprograms11;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listiteratorexample {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		//l.addAll("mubashir","umar","akhlaq","bilal");
		l.add("mubashir");
		l.add("umar");
		l.add("akhlaq");
		l.add("bilal");
		System.out.println(l);
		ListIterator itr=l.listIterator();
		while(itr.hasPrevious())
		{
			String s=(String) itr.previous();
		//System.out.println(s);
		
			if(s.equals("mubashir"))
			{
				itr.remove();
				itr.add("ahtesham");
			}
			else if(s.equals("bilal"))
			{
				itr.set("bilalkhan");
			}
			else if(s.equals("akhlaq"))
			{
				itr.add("Akhlaqkhan");
				itr.add("Akhlaqkhan111");
				
			}
			 System.out.println(itr.next());
		}
		// System.out.println(itr.next());
		
	}
}


