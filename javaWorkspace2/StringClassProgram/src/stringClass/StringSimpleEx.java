package stringClass;

public class StringSimpleEx {
public static void main(String[] args) {
	// creating string by using literal
	String s1= "java";
	char ch[]= {'s','t','r','i','n','g','s'};
	//converting char array to string.....
	String s2= new String(ch);
	// creating new java string by new keyword
	String s3=new String("Example");
	System.out.println("S1:"+s1);
	System.out.println("S2:"+s2);
	System.out.println("S3:"+s3);
	s1=s1.concat("class");
	System.out.println(s1);
}
}
