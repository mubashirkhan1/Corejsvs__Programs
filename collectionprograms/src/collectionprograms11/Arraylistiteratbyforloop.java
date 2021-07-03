package collectionprograms11;

import java.util.ArrayList;

public class Arraylistiteratbyforloop {


		public static void main(String[] args) {
			ArrayList l=new ArrayList();
			//l.addAll("mubashir","umar","akhlaq","bilal");
			l.add("danish");
			l.add("firox");
			l.add("nadeem");
			l.add("huzaifa");
			System.out.println(l);
			int size=l.size();
			for(int i=0; i<=size-1; i++)
			{
				System.out.println(l.get(i));
			}

}}
