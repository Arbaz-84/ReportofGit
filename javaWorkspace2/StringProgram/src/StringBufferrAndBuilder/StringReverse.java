package StringBufferrAndBuilder;

public class StringReverse {

	public static void main(String[] args) {
    //Useing stringBuffer For Reverse string value
	
	String str="Name";
	//Conversion from string object to stringBuffer
	StringBuffer object=new StringBuffer (str);
	object.reverse();
	System.out.println(object);

	}

}
