package String;

public class ReverseString {
public static void main(String[] args) {
	String name="Basic Core Java";
	String reverse="";
	//Useing For loop for reverse the string
	for(int i=name.length()-1;i>=0;i--)
	{
		reverse=reverse+name.charAt(i);
	}
	System.out.println("Reverse String is: "+reverse);
	//
	if(name.toLowerCase().equals(reverse.toLowerCase()))
	{
		System.out.println("ok");
	}
	else
	{
		System.out.println("not ok");
	}
}
}
