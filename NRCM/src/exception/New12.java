package exception;
import java.util.*;
public class New12 {
	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add(34);
		l1.add(45);
		List<Object> l2=new ArrayList<Object>();
		l2.add(12);
		l2.add(34);
		l2.add(45);
		l2.addAll(l1);
		System.out.println(l2);
	}

}
