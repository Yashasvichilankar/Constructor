import java.util.Scanner;

public class Bank {
float amount;
Scanner sc=new Scanner(System.in);
Bank()
{   amount=50;
	System.out.println("Intial amount:"+amount);
}
Bank(float amt)
{   this();
	System.out.println("Enter amount you want to add: ");
	amt=sc.nextFloat();
	amount=amount+amt;
	System.out.println(""+amount);
}
public static void main(String[] args) {
	Bank b2=new Bank(1);
}
}
