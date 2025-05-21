package cdc1;

public class sample2 extends Object {
	int a=89;
	void add() {
		int a=89;
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
	}
	public static void main(String[] args) {
		sample2 s1=new sample2();
		s1.add();
		
		
	}

}
