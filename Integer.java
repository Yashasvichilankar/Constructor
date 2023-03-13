
class I
{
	int i;
	void printNum()
	{
		System.out.println(i);
	}
}
class IntegerJ extends I
{
	int j;
	void printNum()
	{
		super.printNum();
		System.out.println(j);
	}
}
class Integer
{
	public static void main(String[] args) {
		IntegerJ a=new IntegerJ();
		a.printNum();
		
		
	}
}
