package collectionprograms11;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
public class Comparetoronstringonjex {

		public static void main(String[] args) {
			TreeSet t=new TreeSet(new  Costimize55());
			t.add("mango");//16 is root if obj1 is less then obj2 then positive by given condition if
			t.add("apple");//if obj1 is greater then obj2 then -ve value is given by if else condition
			t.add("orange");
			t.add("guaua");
			t.add("watermiilon");
			System.out.println(t);
			//Iterator itr=t.iterator();
		//	while(itr.hasNext()) {System.out.println(itr.next());}
		}

	}
	class Costimize55 implements Comparator{
		
		public int compare(Object obj1,Object obj2)
		{   	String s1=(String)obj1;
		       String s2=obj2.toString();
		      // return s1.compareTo(s2); asending order
		       return s2.compareTo(s1); //desending order
		       
}}
