package methods;
class Student
{
  int rollno;
  String name;
  char grade;
  static String college="DY.Patil College";//static variable
  // create static method to change the value of static variable
  static void change()
  {
	 // college="GSPM";
  }
  //create constructor tp initilize variable
  Student(int r,String n,char c)
  {
	  rollno=r;
	  name=n;
	  grade=c;
  }
  // create method display value
  void display()
  {
	 System.out.println(rollno+" "+name+" "+college+" "+grade); 
  }
  
}
public class Program01 
{
public static void main(String[] args) 
{
	// calling static members useing class name
	Student.change();
    //create object
	Student b1=new Student(111,"Karan",'A');
	Student b2=new Student(222,"Singh",'B');
	Student b3=new Student(333,"Kumar",'C');
	//calling display method
	b1.display();
	b2.display();
	b3.display();
}
}
