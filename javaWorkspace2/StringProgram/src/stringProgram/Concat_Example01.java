package stringProgram;

public class Concat_Example01 {
	public static void main(String[] args) {
		String s1= "java";// creating string by useing java string literal.
		char ch[]= {'S','t','r','i','n','g','s'};
		String s2=new String(ch);
		//creating new java string useing new keywords...
		String s3=new String("example");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		s1=s1.concat(s3);// concat the s1 & s3 --->java+example=javaexample
		System.out.println(s1);
		s2=s2.concat(s3);
		System.out.println(s2);
}
}