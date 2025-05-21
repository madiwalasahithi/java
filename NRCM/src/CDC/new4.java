package CDC;

public class new4 {
   int a=89;
   public void add() {
	   System.out.println("add");
	   
   }
   public void sub() {
	   this.add();
	   System.out.println(this.a);
	   
   }
   public static void main(String[] args) {
	   new4 n1=new new4();
	   n1.sub();
	   
   }
}
