package collectionprograms11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

	public class Listiteratorexample2 {
		public static void main(String[] args) {
			ArrayList l=new ArrayList();
			//l.addAll("mubashir","umar","akhlaq","bilal");
			l.add("mubashir");
			l.add("umar");
			l.add("akhlaq");
			l.add("bilal");
			System.out.println(l);
			ListIterator itr=l.listIterator(l.size());
			while(itr.hasPrevious())
			{
				String s=(String) itr.previous();
			     System.out.println(s);
			}
			
		}}

