package com.basic;

public class Threadgroupex implements Runnable {
	
		public void run() {
			System.out.println("this current thread exexution"+Thread.currentThread().getName());
			
		}
		public static void main(String[] args) {
		
			Threadgroupex t1=new Threadgroupex();
			Thread t=new Thread(t1);
			t.start();
			Thread t2=new Thread(t1);
			System.out.println();
		}
	}



