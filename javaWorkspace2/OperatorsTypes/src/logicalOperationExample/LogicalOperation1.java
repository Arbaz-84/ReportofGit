package logicalOperationExample;

public class LogicalOperation1 {
    public static void main(String[] args) {
		boolean bool1=true,bool2=false;
		
		//Logical AND operation....
		System.out.println("Logical AND Operation: "+(bool1&&bool2));
		
		//Logical OR Operation....
		System.out.println("Logical OR Operation: "+(bool1||bool2));
		
		//Logical NOT Operation...
		System.out.println("Logical NOT Operation: "+!(bool1&&bool2));
	}
}
