package collectionprograms11;

import java.util.TreeSet;

  class Treesetbybookcompcomp  {
	
	 public static void main(String[] args) {
		 TreeSet<Bookcompcomp> t=new TreeSet<Bookcompcomp>();
		 Bookcompcomp obj1=new Bookcompcomp(101,"mubashir");
		 Bookcompcomp obj2=new Bookcompcomp(104,"umar");
		 Bookcompcomp obj3=new Bookcompcomp(100,"huzaifa");
		 Bookcompcomp obj4=new Bookcompcomp(103,"mubashir1");
		 Bookcompcomp obj5=new Bookcompcomp(99,"mohammed");
		 Bookcompcomp obj6=new Bookcompcomp(109,"khalu");
		
		 t.add(obj1);
		 t.add(obj2);
		 t.add(obj3);
		 t.add(obj4);
		 t.add(obj5);
		 t.add(obj6);
		 System.out.println(t);
	}	
	
}
