package variablesTypesProgram;

public class AllVariableExample {
	//instance variable......
	  int empId=233;
	  double salary=30000.50;
	  int age= 35;
	  //static variable.....
	  static long travalingDistance= 65l;
	  static float height=7.5f;
	  static double pinCode= 414004;// initialized + defined
	  
	  String societyName;  // variable declared 
	  
	  //access modifer functionname (){------}
	  void print(int age, String name)
	  {
		  
		  societyName = "Silver Spring";
		  System.out.println("Integer Employee Age: "+age);
		  System.out.println("String EmployeeName: "+name);
		  System.out.println("Socirty name="+societyName);
	  }

	  public static void main(String[] args) {
		// Local variable.....
		  String empName="Arbaz";
		  char grade= 'A';
		  boolean increment= true;
		  long phoneNumber=9988776655l;
		// Object creation for calling non-static members outside main method.
		  AllVariableExample A =new AllVariableExample();
		  // Calling Non-Static Members......
		  // A.salary;
		  System.out.println("Calling Non-Static/ Global/Instance Variable Members...........");
		  System.out.println("Employee ID: "+A.empId);
		  System.out.println("Employee Salary: "+A.salary);
		  System.out.println("Employee age: "+A.age);
		  // Calling Static Members........
		  System.out.println("Calling Static Members...........");
		  System.out.println("Employee TravelingDistance: "+AllVariableExample.travalingDistance);
		  System.out.println("Employee Height: "+AllVariableExample.height);
		  System.out.println("Employee HomeTown Pincode: "+AllVariableExample.pinCode);
		  //Execute the Local Variable
		  System.out.println("Calling Local Variable Members...........");
		  System.out.println("String Variable EmployeeName: "+empName);
		  System.out.println("Employee Grade: "+grade);
		  System.out.println("Employee performance: "+increment);
		  System.out.println("Employee phoneNumber: "+phoneNumber);
		  // Create the Function Method and the calling function method useing referenceVariable.
		  // And passing arugument/parameter at that time of calling 
		  A.print(25,"Arbaz");// paramatrzed function calling
		  
		  A.societyName = "OXY";  /// value assign 
		    
	}
	  

}
