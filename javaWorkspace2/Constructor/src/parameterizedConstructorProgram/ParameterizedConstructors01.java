package parameterizedConstructorProgram;

public class ParameterizedConstructors01 {
	//Create Parameterized constructor with method***
	public static String display(String name1,String name2)// static string method
	{
	String name3=name1+"\n"+name2;  // Static vaiable
	return name3;
	}
	int getAddition(int a, int b) // Non-Static Method with parameterized constructor**
	{
		int c=a+b;
		System.out.println();
		return c;
	
	}
	static int subtraction(int num1,int num2, int num3, int num4)//Static method with parameterized constructor**
	{
		int num5=num1-num2-num3-num4;
		return num5;
	}
	void method1()  // void method create
	{
		Long phoneNumber=9988776655l;
		float pinNumber=4142f;
		int pinCode=414003;
		long pinCode1= pinCode;//Implicity TypesCasting higher--->lower
		System.out.println("Long PhoneNumber: "+phoneNumber);
		System.out.println(pinNumber);
	    System.out.println("Integer value Print:"+pinCode);
	    System.out.println("Long value Print:"+pinCode);
	}
	public static void main(String[] args) {
		//object creation for calling non-static members****
		ParameterizedConstructors01 object=new ParameterizedConstructors01();
		System.out.println("GetAddition Result: "+object.getAddition(20,50));
		object.method1();
		//Static method
		System.out.println(ParameterizedConstructors01.display("Amit","Kumar"));
		System.out.println("Subtraction Result: "+ParameterizedConstructors01.subtraction(100,60,40,30));
		
	}
	

}
