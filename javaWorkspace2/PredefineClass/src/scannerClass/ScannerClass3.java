package scannerClass;

import java.util.Scanner;

public class ScannerClass3 {

	public static void main(String[] args) {
	//int age=30;
	//double salary=25000.50;
	//String name="Pune";
	//Create Scanner class object
	Scanner scan=new Scanner(System.in);
	int age;
	double salary;
	String name;
	boolean vaild;
	// Initialization of variable useing scanner class
	System.out.println("Enter age value from console");
	age=scan.nextInt();
	System.out.println("Enter Salary value from console");
	salary=scan.nextDouble();
	System.out.println("Enter Name value from console");
	name=scan.next();
	System.out.println("Enter true/false value from console");
	vaild=scan.nextBoolean();
	System.out.println("age: "+age);
	System.out.println("salary: "+salary);
	System.out.println("name: "+name);
	System.out.println("vaild: "+vaild);
	int num1,num2;
	int num3,num4;
	System.out.println("Enter Num1: ");
	num1=scan.nextInt();
	System.out.println("Enter Num2: ");
	num2=scan.nextInt();
	System.out.println("Enter Num3: ");
	num3=scan.nextInt();
	System.out.println("Enter Num4: ");
	num4=scan.nextInt();
	char op;
	char op1;
	System.out.println("Enter operator: ");
	op=scan.next().charAt(0);
	op1=scan.next().charAt(0);
	System.out.println("Addition of two numbers: "+addNumber(op,num1,num2));
	System.out.println("Addition of two numbers: "+subtraction(op1,num3,num4));

	}
	private static int subtraction(char op1, int num3, int num4) {
		if(op1=='-')
			{
				return num3-num4;
			}
			else
			{
				return 0;
			}
	}
	static int addNumber(char op,int num1,int num2)
	{
	if(op=='+')
	{
		return num1+num2;
	}
	else
	{
		return 0;
	}
	//int subtraction(char op1,int num3,int num4)
	//if(op=='-')
	//{
	//	return num1-num2;
	//}
	//else
	//{
	//	return 0;
	//}
	}

}
