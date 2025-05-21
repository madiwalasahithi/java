package exception;

public class Demo4 {

       static void add(int a,int b) {
    	  if (b==0) {
    		   throw new ArithmeticException("maths");
    	  }
    	 int  c=a/b;
    	  System.out.println(c);
       }
public static void main(String[] args) {
	try {
		add(10,0);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
    		  
    		    
    	   }
    		   
    	   }
       }
		
		    	  
		