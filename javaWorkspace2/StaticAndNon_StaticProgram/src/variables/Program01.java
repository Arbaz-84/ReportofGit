package variables;

public class Program01 
{
	static class Student
	{
	int rollno;
	String name;
	//Static Variable create......
	static String college= "MIT";//Static Variable...
	//Create Constructor...
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	//method create 
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	}
	public static void main(String[] args) 
	{
		Student s1= new Student(111,"Karan");
		Student s2=new Student(222,"Aryan");
		s1.display();
		s2.display();
	}
    

}
