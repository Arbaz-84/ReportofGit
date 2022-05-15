package AbstractionProgram;
//Abstract class
abstract class Bike
{
//Abstract method create and without method body
abstract void run();	
}
class Honda extends Bike
{
void run()
{
System.out.println("running safely");	
}
}
public class Program2
{
   public static void main(String[] args)  
   {
	//create child class object
	   Honda obj=new Honda();
	   obj.run();
   }
}
