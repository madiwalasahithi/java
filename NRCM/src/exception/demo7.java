package exception;

public class demo7 extends Thread {
	public void run() {
		System.out.println("hi");
		
	}
	public static void main(String[] args) {
		demo7 t1=new demo7();
		System.out.println("hello");
		t1.start();
	}

}
