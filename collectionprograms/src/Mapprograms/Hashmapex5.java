package Mapprograms;

import java.util.HashMap;
import java.util.Map;

public class Hashmapex5 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		System.out.println("befor puting elements"+hm);
		   hm.put(100,"Amit");    
		     hm.put(101,"Vijay");    
		      hm.put(102,"Rahul"); 
		      System.out.println("after put elemnts"+hm);
		      for(Map.Entry m:hm.entrySet()) {
		    	  System.out.println(m.getKey()+"   "+m.getValue());
		      }
		          hm.putIfAbsent(103, "Gaurav");  
		          for(Map.Entry m:hm.entrySet()) {
			    	  System.out.println("putbasent elements  "+m.getKey()+"   "+m.getValue());
		      }

		          HashMap<Integer,String> map=new HashMap<Integer,String>();  
		          map.put(104,"Ravi");  
		          map.putAll(hm);  
		         // map.remove(100);
		          map.replace(101, "don");
		          map.replace(101, "don","non");
		          for(Map.Entry m:map.entrySet()){    
		              System.out.println("afewtre put all    "+m.getKey()+" "+m.getValue());    
		             }  

}}
