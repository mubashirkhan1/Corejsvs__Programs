package collectionprograms11;

import java.util.TreeSet;

 class Bookcompcomp implements Comparable  {
	int id;
	String name;
	public Bookcompcomp(int id, String name) {
	//	super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bookcomparable [id=" + id + ", name=" + name + "]";
	}

    public int CompareTo(Bookcompcomp obj) {
    	int id =this.id;
    	Bookcompcomp ed=(Bookcompcomp)obj;
    	  int id2=ed.id;
    	  if(id<id2) {
		return -1;}
    	  if(id>id2) {
    			return +1;}
    	  else { return 0;}
  
	}}




 