package collectionprograms11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Comparatorex2 {
	public static void main(String[] args) {
	TreeSet t=new TreeSet(new Costimize11());
	t.add(16);//16 is root if obj1 is less then obj2 then positive by given condition if
	t.add(64);//if obj1 is greater then obj2 then -ve value is given by if else condition
	t.add(63);
	t.add(14);
	t.add(16);
	System.out.println(t);
	//Iterator itr=t.iterator();
	//while(itr.hasNext()) {System.out.println(itr.next());}
}

}
class Costimize11 implements Comparator{

public int compare(Object obj1,Object obj2)
{   	Integer i1=(Integer)obj1;
       Integer i2=(Integer)obj2;
        return i1.compareTo(i2); //asendeng order but by user
    //   return -i1.compareTo(i2);//desending easy way to
      // return i2.compareTo(i1);//desending order
   //  return -i2.compareTo(i1); //asending order
     //  return +1; insersion order maintain
     //  return -1; //insersion order reverse maintain
      // return 0;
       
}
	
}
	



