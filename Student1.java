
public class Student1 {
   String name;
   int num;
	Student1()
	{
	System.out.println("Default constructor");
	name="unknown";
	}
	
	Student1(String n){
		System.out.println("Parameterized constructor");
	
	}
	Student1(String n,int num){
		System.out.println("Two paramerterized constructor");
		
	}
	public static void main(String args[])
	{
		Student1 s1=new Student1();
		Student1 s2=new Student1("Yashasvi");
		Student1 s3=new Student1("Yashasvi",139);
		
	}
}
