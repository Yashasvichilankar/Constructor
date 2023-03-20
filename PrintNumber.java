
public class PrintNumber {
void printn(int a)
{
	System.out.println("Integer: "+a);
}
void printn(float a)
{
	System.out.println("Float: "+a);
}
void printn(String a)
{
	System.out.println("String: "+a);
}
void printn(char a)
{
	System.out.println("Character: "+a);
}
void printn(double a)
{
	System.out.println("Double: "+a);
}
public static void main(String[] args)
{
	PrintNumber p1=new PrintNumber();
	p1.printn(5);
	p1.printn(2.2);
	p1.printn("yashasvi");
	p1.printn("A");
	p1.printn(12.354);
}
}
