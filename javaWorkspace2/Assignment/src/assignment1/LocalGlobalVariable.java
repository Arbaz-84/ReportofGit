package assignment1;

public class LocalGlobalVariable {
	// global variable---> Static global vari. and Non-static global vari.
	
	   static int empId=1,age=35;
	   double salary=25000;
	   public static void callA() 
	   {
		   System.out.println("I am callA()");
	   }
	   static int callC(int acc)
	   {
		   System.out.println("I am callC()");
		   return acc;
	   }
	   void callB()
	   {
		   System.out.println("I am callB()");
		   
	   }
	   public double callD(double pin)
	   {
		   System.out.println("I am callD()");
		   System.out.println(pin);
		   return pin;
	   }
public static void main(String[] args)
{  
   // Non-Static member--> double salary,void callB,double callD***
	// Creation Object for calling Non-Static members**
	LocalGlobalVariable ref= new LocalGlobalVariable();
	System.out.println(ref.salary);
	ref.salary=85000;
	System.out.println(ref.salary);
	ref.callB();
	// Way-1
	ref.callD(414003);
	//Way-2
	System.out.println(ref.callD(414003));
	
	
	// Static members  calling useing ClassName****
	System.out.println(LocalGlobalVariable.age);
	System.out.println(LocalGlobalVariable.empId);
	LocalGlobalVariable.callA();
	//Way-1
	LocalGlobalVariable.callC(1234);
	//Way-2
	System.out.println(LocalGlobalVariable.callC(1234));
	//Way-3
	int value=LocalGlobalVariable.callC(1234);
	System.out.println(value);
	
	// Local Varibale inside class body******
	int age=25,salary=25000;
	String EmpName="Sumit";
	char Grade='A';
    System.out.println("Employe Age:"+age);
    System.out.println("Employe Salary:"+salary);
    System.out.println("Employe Name:"+EmpName);
    System.out.println("Employe Rank Grade:"+Grade);    
	
	
	
	
	
	
	
	
}
}
