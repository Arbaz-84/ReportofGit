package programs;

public class Program2 
{
  static int test(int marks1,int marks2)//static method
  {
	  return marks1+marks2;
  }
  static float test(float precentage1,float precentage2)
  {
	  return precentage1+precentage2;
  }
  //Non-Static Method Is overloaded
  String nameclass(String name1,String name2)
  {
	  return name1+name2;
  }
  int nameclass(int salary1 ,int salary2)
  {
	return salary1+salary2;  
  }
  public static void main(String[] args) 
{
	  System.out.println(Program2.test(28, 50));
	  System.out.println(Program2.test(45.50f, 30.50f));
	  
//object create for non-static members
	  Program2 obj=new Program2();	  
	  System.out.println(obj.nameclass("CIVIL","ENGINEERING"));
	  System.out.println(obj.nameclass(111, 222));
	 
}
}
