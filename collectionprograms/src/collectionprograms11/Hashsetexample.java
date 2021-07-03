package collectionprograms11;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexample {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("mubasshir");
		hs.add("khan");
		hs.add("zafer");
		hs.add("ahmed");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//hs.clear();
		//  System.out.println(hs);
		System.out.println(hs.contains("zafher"));
		
	}

	
	}


