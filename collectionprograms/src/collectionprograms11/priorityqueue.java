package collectionprograms11;

import java.util.ArrayList ;
import java.util.PriorityQueue;

public class priorityqueue    {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add("mubashir");
		pq.add("chan");
		pq.add("ahalid");
		pq.add("saif");
		pq.add("zad");
		System.out.println("befor itreting"+ pq);
		 System.out.println(pq.element());
		 System.out.println(pq.peek());
		 pq.remove();
		 pq.poll();
		 System.out.println(pq);
		 ArrayList al1=new ArrayList();
		 al1.add("hello");
		 ArrayList al2=new ArrayList();
		 al2.add("helo");
		// System.out.println(al1.comareTo(al2));
	}

}
