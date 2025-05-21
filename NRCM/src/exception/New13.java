package exception;
import java.util.*;
public class New13 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(34);
		l1.add(45);
		List<Integer> l2=new ArrayList<Integer>(l1);
		l2.add(12);
		l2.add(34);
		l2.add(45);
		System.out.println(l2);
	}

}
