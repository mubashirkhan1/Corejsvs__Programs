package Mapprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maphashmap {
	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put(5, "mubashir");
		m.put(6, "amir");
		m.put(8, "moahmmed");
		m.put(2, "akhlaq");
		//System.out.println(m.entrySet());
		Set s=m.entrySet();
		Iterator itr= s.iterator();
		while(itr.hasNext());
		{
			Map.Entry entry=(Map.Entry) itr.next();
			System.out.println(entry.getKey()+""+entry.getValue());
			//System.out.println("""");
		}
		
	}

}
