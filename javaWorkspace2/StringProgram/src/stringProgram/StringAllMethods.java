package stringProgram;

public class StringAllMethods {
public static void main(String[] args) {
	//useing literals for object creation
	String s1="CoreJavaBasic";
	         //or
	//useing new keyowrds...
	//String s1=new String("CoreJavaBasic");
	//finding number of characters in the string....
	System.out.println("String lenght check: "+s1.length());
	
	// finding the character at index.....
	System.out.println("Character at 3rd Position: "+s1.charAt(3));
	System.out.println("Character at 0rd Position: "+s1.charAt(0));
	System.out.println("Character at 4rd Position: "+s1.charAt(4));
	
	//finding substring from the index character....
	//to end of string...
	System.out.println("Substring form index 3: "+s1.substring(3));
	System.out.println("Substring form index 5: "+s1.substring(5));
	System.out.println("Substring form index 8: "+s1.substring(8));
	
	//finding substring from starting and ending n-1 index....
	System.out.println("Substring form index 2to5: "+s1.substring(2, 5));
	System.out.println("Substring form index 4to7: "+s1.substring(4, 8));
	
	String s2="Core";
	String s3="JavaBasic";
	//useing concat() method....
	System.out.println("First Value S2: "+s2);
	System.out.println("Secound Value S3: "+s3);
	System.out.println("Concat the S2 & S3: "+s2.concat(s3));
	
	String s4="Pune";
	String s5="Mumbai";
	//useing Concat() method and Length() method...
	System.out.println("Concat the S4 & S5:"+s4.concat(s5));
	System.out.println("Multiple concatination: "+s2.concat(s3).concat(s4).concat(s5));
	String s6=s2.concat(s3).concat(s4).concat(s5);
	System.out.println(s6);
	System.out.println("Length of String Object: "+s6.length());
	
	// checking the equality of string......
	String num1="Selenium";
	String num2="selenium";
	String num3="Selenium";
	// Useing equals() and equalsIgnoreCase().....
	System.out.println("checking Equality of num1 & num2:"+num1.equals(num2));//false
	System.out.println("checking Equality of num1 & num2:"+num1.equals(num3));//true
	System.out.println("checking Equality of num1 & num2:"+num2.equals(num3));//false
	System.out.println("checking Equality of num1 & num2:"+num1.equals(num3));//true
	System.out.println("checking Equality of num1 & num2:"+num1.equalsIgnoreCase(num2));
	
	// Converting Cases....
	String word1="corejava";
	String word2="COREJAVA";
	//Useing toUpperCase()method and toLowerCase()method....
	System.out.println("Converting UpperCase: "+word1.toUpperCase());
	System.out.println("Converting UpperCase: "+word2.toLowerCase());
	System.out.println("Converting UpperCase: "+s1.toUpperCase());
	System.out.println("Converting UpperCase: "+s4.toUpperCase());
	System.out.println("Converting UpperCase: "+s5.toUpperCase());
	System.out.println("After trim lenght is:" + word2.trim().length());

	
}
}
