package stringProgram;

public class Concat_Example02 {
public static void main(String[] args) {
	String str1="Hello";
	String str2="java";
	String str3="tpoint";
	//concat the str1+str2....
	String str4= str1.concat(str2);
	System.out.println(str4);
	// concat multiple string...
	String str5=str1.concat(str2).concat(str3);
	System.out.println(str5);
}
}
