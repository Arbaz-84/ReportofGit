package dataTypesProgram;

public class DataTypes2 {
public static void main(String[] args) {
	int age,salary,weight;
	//int age=25,salary=35000,weight=66;
	age=25;
	salary=35000;
	weight = 68;
	
	System.out.println("Integer Value Result:"+age);
	System.out.println("Integer Value Result:"+salary);
	System.out.println("Integer Value Result:"+weight);
	System.out.println("************************");
	
	long num1,num2,num3,num4;
	num1=250L;
	num2=150L;
	num3=num1+num2;
	num4=num1-num2;

	System.out.println("Long Value Result:"+num3);
	System.out.println("Long Value Result:"+num4);
	System.out.println("************************");
	
	float a1,a2,a3;
	a1=75.55f;
	a2=35.65f;
	a3=a1+a2;
	
	System.out.println("Float Value Result:"+a3);
	System.out.println("************************");
	
	double set1,set2,set3,set4,set5;
	set1=55000.25;
	set2=35000.00;
	set3=45000.50;
	set4=set1+set2+set3;
	set5=set1-set2;
	
	System.out.println("Double Value Result:"+set4);
	System.out.println("Double Value Result:"+set5);
	System.out.println("************************");
	
	String empName1="Amit";
	String empName2="Kumar";
	String empName3=empName1+empName2;
	
	System.out.println("String Value Result:"+empName1);
	System.out.println("String Value Result:"+empName2);
	System.out.println("String Value Result:"+empName3);
	System.out.println("************************");
	
	
}
}
