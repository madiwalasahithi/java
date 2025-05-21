package cdc1;

public class sample4 {
	void show() {
		System.out.println("hi");
		
	}
	class test4{
		void print() {
			System.out.println("hello");
		}
	}
	public static void main(String[] args){
		sample4 s1=new sample4();
		s1.show();
		sample4.test4 t1=new sample4().new test4();
		t1.print();
	}
		

}
