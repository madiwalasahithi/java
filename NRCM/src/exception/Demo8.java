package exception;

public class Demo8 implements Runnable {
	public void run() {
		System.out.println("hi");
	}
   public static void main(String[] args) {
	   Demo8 t1=new Demo8();
	   Thread t2=new Thread(t1);
	   System.out.println("hello");
	   t2.start();
   }
}
