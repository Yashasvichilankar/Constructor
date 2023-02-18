import java.util.Scanner;

public class StudentInfo {
String name;
String address;
int age;

StudentInfo()
{
	name="Unknown";
	age=0;
	address="Not available";
}
void setInfo(String name,int age){
	this.name=name;
	this.age=age;
}
void setInfo(String name,int age, String address)
{
	this.name=name;
	this.age=age;
	this.address=address;
}
public static void main(String[] args) {
	StudentInfo[] stud=new StudentInfo[4];
	
	for(int i=0;i<stud.length;i++)
	{
		stud[i]=new StudentInfo();
	}
	stud[0].name="Yashasvi";
	stud[0].age=21;
	stud[0].address="Nagpur";
	
	stud[1].name="Mrunali";
	stud[1].age=23;
	
	stud[3].name="Asterisc";
	stud[3].age=25;
	stud[3].address="Mumbai";
	
	String n,add;
	int a;
	for(int i=0;i<stud.length;i++)
	{
		n=stud[i].name;
		a=stud[i].age;
		add=stud[i].address;
		System.out.println("Name: "+n+" \tAge:"+a+" \tAddress:"+add);
	}
}
}

