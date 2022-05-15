package parameterizedConstructorProgram;

public class ParameterizedConstructor2
{
  // Non-static method with parameterized constructor******
	int getEmpId(int num1,int num2)// non-static method 
	{
		int num3=num1+num2;
		return num3;
		//System.out.println(num3);
	}
	//Static Method with 
	public static double addNumber(double salary1,double salary2)
	{
		double salary3= salary1+salary2;
		return salary3;	
	}
	public static float addition(float sem1,float sem2)
	{
		float marksTotalsem=sem1+sem2;
		return marksTotalsem;
	}
	public static void main(String[] args) 
	{
		//Object create for Non-static member***
		ParameterizedConstructor2 obj= new ParameterizedConstructor2();
		//way-1
		//obj.getEmpId(50, 20);
		//way-2
		System.out.println("Show Result GetEmpId: "+obj.getEmpId(50, 30));
		System.out.println("Static Method Addnumber Result: "+ParameterizedConstructor2.addNumber(35000,20000));
		System.out.println("Static Method Addition Result:"+ParameterizedConstructor2.addition(45.50f, 40.50f));
	}
}
