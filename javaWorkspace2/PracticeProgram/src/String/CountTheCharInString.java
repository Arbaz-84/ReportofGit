package String;

public class CountTheCharInString {
public static void main(String[] args) {
	String name="Java";
	int count=0;
	//count the each char
	for(int i=0;i<name.length();i++)
	{
	    if(name.charAt(i) !=' ')
	    	count++;
	}
	System.out.println(count);
}
}
