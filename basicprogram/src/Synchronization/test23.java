package Synchronization;

class Table5 {
	int c=1;
		void printtable(int n) {
	synchronized(this) {
	for(int i=1;i<=10;i++) 
		{System.out.println(n*i);
	try {
	Thread.sleep(500);
	}catch(Exception e) {System.out.println(e);}
	}
	 for(int j=1; j<=n;j++) {
		 c=c*j;
		
	  System.out.println("fact no"+c);
	}
	}
	}
	
}
class Thread3 extends Thread
{
  Table1 t;	
  Thread3 (Table1 t){
	  this.t=t;
  }
  public void run() {
	  t.printtable(6);
  }
}
class Thread4 extends Thread
{
  Table1 t;	
  Thread4(Table1 t){
	  this.t=t;
  }
  public void run() {
	  t.printtable(555);
  }
}
  

public class test23 {
	 public static void main(String[] args) throws Exception{
		  Table1 t1=new Table1();
		  Thread1 th1=new Thread1(t1);
		  Thread2 th2=new Thread2(t1);
		  
	    	 th1.start();
	    	 th2.start();
	}
}
