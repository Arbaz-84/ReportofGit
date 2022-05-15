package variablesTypesProgram;

public class InstanceVariableExample01 {
	     //Global/instance variable.....
	     int empId1= 202;            // non-static instance variable....
	     static double salary=25000.12;// static instance variable....
	     
        public static void main(String[] args) {
        	int empNumber=45;
        	//object creation for calling non-static member...
        	// syntax: className referenceVariableName = new className 
        	InstanceVariableExample01 obj =new InstanceVariableExample01 ();
        	System.out.println("Global variable: "+InstanceVariableExample01.salary);
        	System.out.println("empId1: "+obj.empId1);
        	
			
		}
}
