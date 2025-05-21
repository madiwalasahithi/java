package exception;

public class New3 extends Thread {
	String s;
	public New3(String name) {
		s=name;
		
	}
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(s+" is Daemon Thread");
		}
		else
		{
			System.out.println(s +" is user thread");
		}
	}
	public static void main(String[] args) {
		New3 thread1=new New3("thread1");
		New3 thread2=new New3("thread2");
		New3 thread3=new New3("thread3");
		 thread1.setDaemon(true);
		 thread1.start();
		 thread2.start();
		 thread3.setDaemon(false);
		 thread3.start();
		 
	}
}
