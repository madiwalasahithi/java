package exception;

// Thread class
class Test34 extends Thread {
    public void run() {
        System.out.println("gm");
    }
}
class Test001 extends Test34 {
    public void run() {
        System.out.println("gm from Test001");
    }
}

class Test24 implements Runnable {
    public void run() {
        System.out.println("hello");
    }
}


class Test003 implements Runnable {
    public void run() {
        System.out.println("archana");
    }
}
public class New1 {
    public static void main(String[] args) {
        Test001 t1 = new Test001();       
        Test34 t4 = new Test34();          
        Test24 t5 = new Test24();          
        Test003 t6 = new Test003();       

        t1.start();                        
        t4.start();                       
        Thread t3 = new Thread(t5);        
        t3.start();                       
        Thread t7 = new Thread(t6);        
        t7.start();                        
    }
}
