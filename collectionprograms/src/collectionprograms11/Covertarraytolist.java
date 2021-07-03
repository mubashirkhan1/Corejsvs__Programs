package collectionprograms11;

import java.util.ArrayList;
import java.util.Arrays;

public class Covertarraytolist {
	public static void main(String[] args) {
		String []array= {"java","python","c#","ruby"};
		System.out.println("printing with ARRAY"+" "+Arrays.toString(array));
		//for(int i=0;i<=array.length-1; i++)
		//{
		//	System.out.println(array[i]);
		//}
		ArrayList l=new ArrayList();
		/*//for(String val:array)*/for(int i=0;i<=array.length-1; i++) {
		//int	p=array[i];
			l.add(array[i]);
			//System.out.println(l);
		}
		System.out.println("with arrat ist"+l);
	}
}
