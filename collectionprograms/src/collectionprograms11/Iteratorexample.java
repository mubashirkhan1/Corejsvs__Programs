package collectionprograms11;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorexample {
public static void main(String[] args) {

ArrayList l=new ArrayList();
for(int i=0; i<=10; i++) {
	l.add(i);
}
System.out.println(l);
Iterator itr= l.iterator();
while(itr.hasNext())
{
	Integer d=(Integer) itr.next();
	System.out.println(d);
	 if(d%2==0)
		 
	 {
		System.out.println(d); 
		 
	 }
	 else {
		// itr.remove();
	 }
}
	System.out.println(l);

}}
