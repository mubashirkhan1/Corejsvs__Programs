package Mapprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sorted1 {
	public static void main(String[] args) {
		Map mm=new HashMap();
		mm.put("one",1);
		mm.put("two",2);
		mm.put("three",3);
		mm.put("four",4);
		mm.put("nagaar", 6778);
		
		//System.out.println(m );
		//System.out.println(m.put("two", 8));
		Set s=mm.entrySet();
	  //  Collection s1=m.values();
		
		//System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry )itr.next();
			//System.out.println(m1);
			System.out.println(m1.getKey()+"     "+m1.getValue());
		//	if(m1.getKey().equals("four")){m1.setValue(1000000);}
			/// System.out.println(m1);
		}
		// System.out.println(mm);  
		
		
	}

		
	}

