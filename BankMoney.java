class Money{
	int getBalance()
	{
		return 0;
	}
}
class BankA extends Money {
	int getBalance1(int bal)
	{
		return bal;
	}
}
class BankB extends BankA
{
	int getBalance2(int bal)
	{
		return bal;
	}
}
class BankC extends BankB{
	int getBalance3(int bal)
	{
	return bal;
	}
	
}
public class BankMoney
{
	public static void main(String[] args) {
		BankC c=new BankC();
		System.out.println("$"+c.getBalance());
		System.out.println("$"+c.getBalance1(1000));
		System.out.println("$"+c.getBalance2(1500));
		System.out.println("$"+c.getBalance3(2000));
	}
}