package SingleInheritance;
//Single Inheritance 
class Employee
{
   float salary=40000;
  
}
class Programmer extends Employee
{
int bonus=10000;

}
public class Program1 
{
public static void main(String[] args) 
{
	//create Object of class to be extends
	Programmer s1=new Programmer();
	System.out.println("Programmer salary is:"+s1.salary);
	System.out.println("Bonus of Programmer is:"+s1.bonus);
}
}
