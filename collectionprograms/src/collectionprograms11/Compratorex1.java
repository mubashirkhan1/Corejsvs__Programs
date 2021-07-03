package collectionprograms11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Compratorex1 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new Costimize());
		t.add(16);//16 is root if obj1 is less then obj2 then positive by given condition if
		t.add(64);//if obj1 is greater then obj2 then -ve value is given by if else condition
		t.add(63);
		t.add(14);
		t.add(16);
		System.out.println(t);
		Iterator itr=t.iterator();
		while(itr.hasNext()) {System.out.println(itr.next());}
	}

}
class Costimize implements Comparator{
	
	public int compare(Object obj1,Object obj2)
	{   	Integer i1=(Integer)obj1;
	       Integer i2=(Integer)obj2;
		if(i1<i2) {
		return +1;
		}
		else if(i1>i2) 
		{
			return -1;
		}
		else {
			return 0;
		}
	}
		
	}

