package com.java;

abstract class Abstract1 {
 
		  abstract void run();  
		  public static void main(String args[]){  
					Abstract1 obj = new Honda4();  
				 obj.run();  
		  }
		}  
		class Honda4 extends Abstract1{  
		void run(){System.out.println("running safely");
		}
	}
			
		//public static void main(String args[]){  
		//	Abstract1 obj = new Honda4();  
		// obj.run();  
		  
	//	}  
