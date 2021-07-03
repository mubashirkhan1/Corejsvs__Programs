package collectionprograms11;
   class Ab{

	  void m1() {System.out.println("hello");}
		// TODO Auto-generated method stub
		
	}
public class Anonymousinnerclass {
	public static void main(String[] args) {
		
		 Ab a=new Ab() {
			
		public	void m1() {
				System.out.println("mubashir khan");
			}
		};
		   a.m1();
		  
	
	 }

}

