package Synchronization;

import com.basic.Table;

class Table1 {
	synchronized	 void printtable(int n) {
	for(int i=1;i<=10;i++) {System.out.println(n*i);
	try {
	Thread.sleep(500);
	}catch(Exception e) {System.out.println(e);}
	}
	}
	
}
class Thread1 extends Thread
{
  Table1 t;	
  Thread1(Table1 t){
	  this.t=t;
  }
  public void run() {
	  t.printtable(7);
  }
}
class Thread2 extends Thread
{
  Table1 t;	
  Thread2(Table1 t){
	  this.t=t;
  }
  public void run() {
	  t.printtable(55);
  }
}
  class Synchronization1 {
	  public static void main(String[] args) throws Exception{
		  Table1 t1=new Table1();
		  Thread1 th1=new Thread1(t1);
		  Thread2 th2=new Thread2(t1);
		  
	    	 th1.start();
	    	 th2.start();
	}

}
