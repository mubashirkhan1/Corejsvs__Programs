package collectionprograms11;

import java.util.ArrayList;

public class Arraylistaddelemnts {
	public static void main(String[] args) {
		
	
	ArrayList al=new ArrayList();
    al.add("khan");  
    al.add("zafer");  
    al.add("Ahmed");  
    System.out.println("after ivoking simply add elements      " + ""+al);
    al.add(2, "moahmmed");
    System.out.println("after ivoking index  base add elements      " + ""+al);
    ArrayList al2=new ArrayList();
    al2.add("umar");
    al2.add("zaki");
   // System.out.println ("before addings firs arraylist obj"+""+al2);
   // al2.add(al);
    al.add(al2);
    System.out.println ("after addings firs arraylist obj     "+""+al);
    ArrayList al3=new ArrayList();
    al3.add("mobile");
    al3.add("mobile11");
    al.addAll(1,al3);
    System.out.println("After invoking addAll(int index, Collectioc) method"+ ""+al);
	}
}
