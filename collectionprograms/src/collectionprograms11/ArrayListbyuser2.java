package collectionprograms11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListbyuser2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array size");
		int a=sc.nextInt();
		//String array[]= new String[a];
		System.out.println("add String elements in array");
	
		String array[]= new String[a];
		for(int i=0;i<a;i++)
		{
			array[i]=sc.next();
			String t[]=array;
			//System.out.println(ab);
			System.out.println(t[i]);
		}
		// 	`      System.out.println([a]);
		//System.out.println(t);
		
		// for(int j=0;j<=array.length-1;j++)
		// {
			// System.out.println(ab[j]);
		// }*/for(String value:array) {System.out.println(value);}
		//System.out.println(array[i]);
		/*ArrayList<String> al=new ArrayList();
		System.out.println("add elemnt");
		for(int i=1;i<=a-1;i++)
		{ System.out.println();
			al.add(sc.next());
		}
		System.out.println(al);
		System.out.println(al.size());
		for(String value:al) {System.out.println(value);}*/
	}

}
