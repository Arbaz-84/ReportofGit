package stringProgram;

public class Concat_Example03 
{
public static void main(String[] args)
{
	//Concatination method use in this program concat();
	String str1="The best",str2="of both words",str3=str1+str2;
	System.out.println(str3);
	System.out.println("***************");
	System.out.println("Useing Concat method:"+str1.concat(str2));
	
	//Length method use in this program length();
	String name="The Basic java";
	String name1="Class";
	System.out.println(name.length());
	System.out.println(name1.length());
	
	System.out.println("**************************");
	
	//CharAt method use in this program charAt(); finding char value useing index based
	
	String string = "DhanoriPune";// output: enuPironahD

	char c = string.charAt(2);
	char d=string.charAt(7);
	System.out.println("Char at index 2: " + c);
	System.out.println("Char at index 7: " + d);
	
}
}
