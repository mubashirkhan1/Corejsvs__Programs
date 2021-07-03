package Mapprograms;

import java.util.Comparator;
import java.util.TreeMap;

public class Treemapcoustimizesorting {
public static void main(String[] args) {
	TreeMap t1=new TreeMap(new Coustimize());
	t1.put(3,"kkk");
	t1.put(1,"qqq");
	t1.put(2,"nnn");
	t1.put(4,"xzx");
	System.out.println(t1);
}
}
class Coustimize implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;

		return i2.compareTo(i1);
	}
	

}