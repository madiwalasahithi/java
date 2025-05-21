package CDC;
class FixedAmount{
	public int amount=10000;
}
abstract class Withdrawal{
	abstract void withdraw(int amount);
}

public class Demo15  extends Withdrawal{
	FixedAmount f1=new FixedAmount();
	
void withdraw(int amount) {
	f1.amount -= amount;
	System.out.println("Withdrawn: "+amount);
	System.out.println("Available balance: "+f1.amount);
}

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("pelase enter am");
			return;
		}
		int amount = Integer.parseInt(args[0]);
		Demo15 d = new Demo15();
		d.withdraw(amount);

	}

}
