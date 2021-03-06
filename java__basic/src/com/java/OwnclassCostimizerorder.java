package com.java;

import java.util.Comparator;
import java.util.TreeSet;

class Employe implements Comparable{
	 int id;
	 String name;
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	 
 
	
@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + "]";
	}



@Override
public int compareTo(Object obj1) {
	int id1=this.id;
			Employe e=(Employe)obj1;
			int id2=e.id;
			if(id1<id2) {return -1;}
			else if(id1>id2) {return +1;}
			else {return 0;}
}
   
 }


public class OwnclassCostimizerorder {
	public static void main(String[] args) {
		Employe e1=new Employe(102,"mubashirkhan");
		Employe e2=new Employe(105,"umarkhan");
		Employe e3=new Employe(103,"jameelkhan");
		Employe e4=new Employe(104,"zubairkhan");
		TreeSet ts=new TreeSet();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e4);
		//System.out.println(ts);
		TreeSet ts1=new TreeSet(new Mycomparator10());
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e4);
		System.out.println(ts1);
		
	}

}
class Mycomparator10 implements Comparator
{
	public int compare(Object obj1 ,Object obj2) {
		Employe c1=(Employe)obj1;
		Employe c2=(Employe)obj2;
		String n1=c1.name;
		String n2=c2.name;
	   return -n1.compareTo(n2);
	}
}