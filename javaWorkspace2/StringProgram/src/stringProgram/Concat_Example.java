package stringProgram;

public class Concat_Example {
 public static void main(String[] args) 
 {
	//creating string class object useing literals.....
	 String s1="java string";
	 //creating string class object by using new keywords...
     String s2=new String("  is immutable so assign it explicity");
     System.out.println("S1 String result print: "+s1);
     // useing concat() method for s1 & s2 object.....
     s2=s1.concat(s2);
     System.out.println("S2 result print useing concat method: "+s2);
     
 }
}
