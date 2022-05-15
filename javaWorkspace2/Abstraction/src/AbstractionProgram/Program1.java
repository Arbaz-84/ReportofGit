package AbstractionProgram;
abstract class A //abstract class
{
	static void sample()
	{
		//concrete method
		System.out.println("Running Sample****");
	}
	static void display()
	{
		System.out.println("****************");
	}
	abstract void sample2();  //abstract method
	//abstract method without body
}
public class Program1 
{
    public static void main(String[] args)
    {
		System.out.println("Program start****");
		A.sample();
		A.display();
		//A.sample2();
		System.out.println("Program End****");
	}
}
