package collectionprograms11;

public class Thread1 extends Thread{
	public void run() {
		try {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		}catch(Exception e) {System.out.println(e);}
		
	}
	public static void main(String[] args) {
		Thread1 t=new Thread1();
		//t.run();
		t.start();
		Thread1 t1=new Thread1();
		//t1.run();
		t1.start();
	}

}
