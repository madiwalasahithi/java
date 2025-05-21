package cdc1;
class Sample7{
	static void show() {
		System.out.println("hi");
	}
	static class Test56{
		static void print() {
			System.out.println("hello");
			show();
		}
	}
}
public  class Sample6 {
	public static void main(String[] args) {
		Sample7.Test56.print();
		
	}

}
