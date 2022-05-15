package methodExample;

public class methodSimple {
     public int getAddition(int a,int b)
     {
    	 int c=a+b;
    	 return c;
    	 
     }
     public static String empName(String nam1,String nam2)
     {
    	 String nam3=nam1+"\t"+nam2;
    	 return nam3;
     }
     public static void main(String[] args) {
		// object creation 
    	 methodSimple obj1=new methodSimple ();
    	 obj1.getAddition(15, 25);
    	 System.out.println("Addition of two string name: "+methodSimple.empName("arbaz","shaikh"));
    	 System.out.println("Get the Addition of two value: "+obj1.getAddition(15, 25));
	}
}
