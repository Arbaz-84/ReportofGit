package stringProgram;

public class PalindromeString01 {
public static void main(String[] args) {
	String name1="Level";
	String reverse=" ";
	System.out.println("Finding string length:"+name1.length());
	//Reverse the string 
	for(int i=name1.length()-1;i>=0;i--)
	{
		reverse=reverse+name1.charAt(i);
		
	}
	
	System.out.println("Reverse string:"+reverse);
	String className="radar";
	String revClassName=" ";
	for(int i=className.length()-1;i>=0;i--)
	{
		revClassName=revClassName+className.charAt(i);
	}
	System.out.println("Reverse String Print:"+revClassName);
	//String is palindrome or not 
	if(className.equalsIgnoreCase(revClassName))
	{
		System.out.println("Palindrome string is ok");
	}
	else
	{
		System.out.println("Palindrome string is not ok");
	}
}
}
