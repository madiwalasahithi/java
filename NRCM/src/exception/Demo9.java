package exception;

class Demo10 extends Thread {
    public void run() {
        System.out.println("hi");
    }
}
class Demo11 implements Runnable {
    public void run() {
        System.out.println("good morning");
    }
}
public class Demo9 {
    public static void main(String[] args) {
        Demo10 t1 = new Demo10();
        Demo11 t2 = new Demo11();
        
        t1.start(); 
        Thread t3 = new Thread(t2); 
        t3.start(); 
    }
}
