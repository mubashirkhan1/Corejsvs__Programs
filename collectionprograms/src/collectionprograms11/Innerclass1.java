package collectionprograms11;
import collectionprograms11.Innerclassinterface.A1;
public class Innerclass1 {
	
		public static void main(String[] args) {
			A1 a=new A1();
			a.show4();
			A1.A2 a1=a.new A2();
			a1.show5();
			A1.A2.A3 a3=a1.new A3();
			a3.show6();
			String b=new String("mubashir");
			String b1=new String("mubashir");
			StringBuffer c1=new StringBuffer("ba");
			StringBuffer c2=new StringBuffer("ab");
			System.out.println(b.equals(b1));
			System.out.println(c1.equals(c2));
			System.out.println(c1==c2);
			System.out.println(c1.compareTo(c2));
		}
		
	}
	


