package stringProgram;

public class ReverseString2 {
public static void main(String[] args) {
	String str="Core Java Basic";
	String reverse = " ";
	//useing for for reverse the string 
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	System.out.println("Orignal String: "+str);
	System.out.println("Reverse String: "+reverse);
	//String Palindrome useing if else condition
	if(str.equalsIgnoreCase(reverse))
	{
		System.out.println("String is Palindrome");
	}
	else
	{
		System.out.println("String is not Palidrome");
	}
	String idName="Mam";
	String reverseName=" ";
	//Useing For loop fro reverseing stringname
	for(int i=idName.length()-1;i>=0;i--)
	{
		reverseName=reverseName+idName.charAt(i);
	}
	//System.out.println("Orignal String IdName="+idName);
	System.out.println("Reverse String IdName="+reverseName);
	
	//Palindrome of string IdName useing If_else condition
	if(idName.equals(reverseName))
	{
		System.out.println("Palindrome of string is ok");
	}
	else
	{
		System.out.println("Palindrome of string is not ok");
	}
	
}
}
