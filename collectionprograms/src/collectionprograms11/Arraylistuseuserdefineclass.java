package collectionprograms11;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistuseuserdefineclass {
	public static void main(String[] args) {
		Userdefinestudent st=new Userdefinestudent(101,"mohammed",20);
		Userdefinestudent st1=new Userdefinestudent(102,"choudhry",21);
		Userdefinestudent st2=new Userdefinestudent(103,"bilal",22);
		Userdefinestudent st3=new Userdefinestudent(104,"urwah",23);
		ArrayList<Userdefinestudent> al=new ArrayList<Userdefinestudent>();
		al.add(st);
		al.add(st1);
		al.add(st2);
		al.add(st3);
		//System.out.println(al);
		System.out.println(st.rollno+""+ st.name+" "+st.age);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Userdefinestudent v=(Userdefinestudent) itr.next();
			System.out.println(v.rollno+""+ v.name+" "+v.age);
		}	
		
	}

}
