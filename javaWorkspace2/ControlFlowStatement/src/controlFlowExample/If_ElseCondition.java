package controlFlowExample;

public class If_ElseCondition {
public static void main(String[] args) {
	int number=2;
	if(number/2==0)//odd number
	{
		System.out.println("Even Number");
	}
	else
	{
		System.out.println("Odd number");
	}
	int num1=10,num2=30;
	if(num1==num2)//num1 is equal to num2
	{
		System.out.println("num1 is equal to num2");//
	}
	else
	{
		System.out.println("num1 is not equal to num2 ");
	}
	if(num1>num2)//num1 not greater than num2
	{
		System.out.println("num1 greater than num2");
	}
	else
	{
		System.out.println("num1 not grater than num2");
	}
	if(num1<num2)//num1 is not less than num2
	{
		System.out.println("num1 is less than num2");
	}
	else
	{
		System.out.println("num1 is not less than num2");
	}
}
}
