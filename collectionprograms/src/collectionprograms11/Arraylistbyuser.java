package collectionprograms11;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylistbyuser {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> al=new ArrayList();
		System.out.println("enter your size of arraylists");
		int arr=s.nextInt();
		
		for(int i=1;i<=arr;i++) {
			//lets have 5 number in array list usefor loop for that
		System.out.println("enter your number");
			al.add(s.next());
		}
		
		System.out.println(al);
		//5Collections.sort(al);
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(al.size());
	}

}
