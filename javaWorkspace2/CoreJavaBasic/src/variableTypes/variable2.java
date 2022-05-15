package variableTypes;

public class variable2 {
    // static int A=40;
     //static int B=60;
     //static int C= A+B;
     static int a=20,b=20,c=a+b;
     //Static variable
     float ImpId1=23.3f,ImpId2=24.4f,ImpId3=ImpId1+ImpId2;
     //Non-Static variable   
     void method1()
     {
        double Salary= 15000d;
        // Local variable
       System.out.println("My Salary: "+Salary);
       
     }    		 
     public static void main(String[] args) {		
    	 int age1=24,age2=35,age3=45,age4=age1+age2+age3;
    	 long staffSalary1=100000l,staffSalary2=55000l,staffSalary3=staffSalary1-staffSalary2;
    	 String ImpName1="Arbaz",ImpName2="Shaikh",ImpName3=ImpName1+ImpName2;
    	 //Upper all Local Variable
    	 //object creation for calling non-static variable.
    	 variable2 obj1=new variable2();
    	 System.out.println("Result Local Variable: "+age4);
    	 System.out.println("Result Local Variable: "+staffSalary3);
    	 System.out.println("Result Local Variable/String datatype: "+ImpName3);
    	 System.out.println("Static Vaiable Result: "+variable2.c);
    	 System.out.println("Non-Static Vaiable Result: "+obj1.ImpId3);
    	 
	}
		
	
     
}
