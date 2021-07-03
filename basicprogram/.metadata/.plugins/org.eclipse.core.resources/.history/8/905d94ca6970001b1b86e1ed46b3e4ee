package Mapprograms;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Weekhashmap {
public static void main(String[] args) throws Exception {
WeakHashMap h=new WeakHashMap();
Tempt p1=new Tempt();
h.put(p1,"mubashir"); 
System.out.println(h);
p1=null;
System.gc();
Thread.sleep(5000);
System.out.println(h);;

}

}




class Tempt{
	  public String toString() {       
  	   return "temp";    
     }  
	 public void finalize() {
     System.out.println("fivilize called");
	 }    
	 
}                          