package collectionprograms11;

import java.util.HashMap;

public class Hashmap8 {
	public static void main(String[] args) {
		Test33 t1=new Test33(5);
		Test33 t2=new Test33(5);
		HashMap<Test33,String> hm=new HashMap<Test33,String>();
		hm.put(t1, "dol");
		hm.put(t2, "poll");
		System.out.println(hm);
		System.out.println(hm.size());
		Integer i1=new Integer(6);
		Integer i2=new Integer(6);
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(i1, "palkistan");
		hm1.put(i2, "india");
		System.out.println(hm1);
		System.out.println(hm1.size());
	}

}

class Test33
{
	int id;
public Test33(int id)	{
	this.id=id;
			
}
}
