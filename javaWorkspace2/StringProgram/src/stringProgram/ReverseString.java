package stringProgram;

public class ReverseString {
public static void main(String[] args) {
	String str1="Mam";
	String str2="";
	
	//Useing For loop
	for(int i=str1.length()-1;i>=0;i--)
	{
		str2= str2 + str1.charAt(i);
		
	}
	System.out.println("reverse string="+str2);
	if(str1.equalsIgnoreCase(str2))
	{
		System.out.println(str1 + "string is palindrome ");
	}
	else
	{
		System.out.println(str1 +" string is not palindrome");
	}
}
}
