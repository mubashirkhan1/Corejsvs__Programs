package collectionprograms11;

import java.util.ArrayList;

public class ArrayListgetandsetExample4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("marcedies");
		al.add("honda");
		al.add("bmw");
		al.add("farari");
		System.out.println("returning element" +al.get(1));
		al.set(2, "roys royals");
		al.set(3 ,"rower");
	
		for(Object va:al) {
			System.out.println(va);
		}
	}

}
