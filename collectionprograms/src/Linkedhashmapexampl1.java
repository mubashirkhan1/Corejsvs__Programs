import java.util.LinkedHashMap;

public class Linkedhashmapexampl1 {
	public static void main(String[] args) {
		LinkedHashMap lm=new LinkedHashMap();
		lm.put(8,"m");
		lm.put(5,"n");
		lm.put(1,"b");
		lm.put(9,"a");
		lm.put(7,"m");
		lm.put(6,"e");
		lm.put(3,"m");
		lm.put(3,"22");
		System.out.println(lm);
        System.out.println(lm.get(3));
        Integer i=new Integer(10);
        Integer i2=new Integer(10);
        String sb=new String("mubashir khan ");
        String sb1=new String("mubashir khan ");
        System.out.println(i.equals(i2));
        System.out.println(sb.equals(sb));
	}

}
