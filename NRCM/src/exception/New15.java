package exception;
import java.util.*;
public class New15 {

	public static void main(String[] args) {
	  List<Object>l1=new ArrayList<Object>();
	  l1.add(12);
	  l1.add("hi");
	  l1.add(87);
	  l1.add(2,"hello");
	  System.out.println(l1);
	  List<Object> extra=Arrays.asList(39,89,90);
	  l1.addAll(1,extra);
	  System.out.println(l1.get(6));
	  System.out.println(l1.indexOf(90));
	  Object[] arr=l1.toArray();
	  for(Object a1:arr) {
	  //Object[] arr=l1.toArray();
      System.out.println(a1);
	}

}
}