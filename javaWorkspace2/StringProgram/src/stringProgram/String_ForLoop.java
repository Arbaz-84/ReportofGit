package stringProgram;

public class String_ForLoop {
 public static void main(String[] args) {
	String str1="DhanoriPune";
	//Useing Reverse()method
	//System.out.println(str1.charAt(0));
	
	//Useing for loop...
	for(int i=0;i<str1.length();i++)
	{
		System.out.println("Normal flow of string: "+str1.charAt(i));
	}
	System.out.println("*****************");
	for(int i= str1.length()-1;i>=0;i--)
	{
		//System.out.println(str1.charAt(i));
	}
	System.out.println("*****************");
	String temp="";
	for(int i=str1.length()-1; i>=0;i--)
	{
		temp=temp + str1.charAt(i);		
	}
	System.out.println("str1: "+temp);
}
}
