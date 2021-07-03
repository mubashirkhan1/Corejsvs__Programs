package collectionprograms11;

public interface Exinterface {
	void m1();
	void m2();
	void show4();

}
class A implements Exinterface{
	
	void m1() {
		System.out.println("mubashir");	
	}
	class B implements Exinterface
	{
public	void m1() {
		System.out.println("khan");	
	}	
public	void m2() {
		
	System.out.println("khan");	
	}	
	}
}
