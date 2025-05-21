package exception;
import java.util.*;
public class New20{
	public static void main(String[] args) {
		Set<Integer> q1=new LinkedHashSet<Integer>();
		q1.add(12);
		q1.add(89);
		q1.add(null);
		q1.add(89);
		q1.add(null);
		System.out.println(q1);
		
	}
}
