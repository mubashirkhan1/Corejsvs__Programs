package collectionprograms11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExampleiterator2 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1; i<=10;i++) {
			
			al.add(i);
		}
		System.out.println(al);
		Iterator itr= al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
