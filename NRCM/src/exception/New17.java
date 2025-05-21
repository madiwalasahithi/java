package exception;
import java.util.*;
public class New17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(123);
		l1.addFirst( 1);
		l1.addLast( 5);
		l1.add( 2, 3);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		l1.removeFirstOccurrence( 3);
		

	}

}