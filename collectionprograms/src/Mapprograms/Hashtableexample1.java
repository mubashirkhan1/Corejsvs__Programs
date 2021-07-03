package Mapprograms;

import java.util.Hashtable;
import java.util.TreeMap;

public class Hashtableexample1 {
	public static void main(String[] args) {
		Hashtable t=new Hashtable();
		t.put(new Temp9(5), "A");
		t.put(new Temp9(2), "B");
		t.put(new Temp9(6), "C");
		t.put(new Temp9(15), "D");
		t.put(new Temp9(23), "E");
		t.put(new Temp9(16), "F");
		System.out.println(t);
		Hashtable t1=new Hashtable();
		t1.put(55, "machli");
		t1.put(45, "NOLL");
		t1.put(24,"KULLI");
		t1.put(22, "sACHI");
		System.out.println(t1);
		
	
	}

}
class Temp9{
	int i;
	Temp9(int i){
	this.i=i;	
	}
	@Override
	public int hashCode() {
		return i;
	
}
	public String toString() {
		return i+"";
	}
}
