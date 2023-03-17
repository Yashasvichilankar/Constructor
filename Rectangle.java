import java.util.Scanner;

public class Rectangle {
	Scanner sc=new Scanner(System.in);
	int length;
	int breadth;
	int area;
	Rectangle()
	{
		length=0;
		breadth=0;
	}
	Rectangle(int l,int b)
	{
		System.out.println("Enter length of the rectangle");
		length=sc.nextInt();
		System.out.println("Enter breadth of the rectangle");
		breadth=sc.nextInt();
	}
	void area()
	{
	area=length*breadth;
	System.out.println("Area of the rectangle is: "+area);
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Rectangle r1=new Rectangle(1,2);
		r1.area();
	}
}
