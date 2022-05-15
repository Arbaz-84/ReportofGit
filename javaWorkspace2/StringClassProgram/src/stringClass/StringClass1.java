package stringClass;

public class StringClass1 {
  public static void main(String[] args) {
	StringClass1 c1=new StringClass1();
	System.out.println("c1: "+c1);
	//string class object creation....
	//useing literal.....
	String s1="Mumbai"; // new object create in constant pool
	String s2="Mumbai";
	String s3="Bangalore";
	
	System.out.println("s1:"+s1);
	System.out.println("s2:"+s2);
	System.out.println("s3:"+s3);
	System.out.println("s1 char count:"+s1.length());
	System.out.println("s2 char count:"+s2.length());
	System.out.println("s3 char count:"+s3.length());
}
}
