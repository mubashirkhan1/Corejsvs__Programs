package collectionprograms11;

import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayListxample3foreach {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	
		for(int i=0;i<5;i++) {
			al.add(i);
		}
		
		for(Object q:al) {
			System.out.println(q);
			
		}

	}
}
