package StringBufferrAndBuilder;

public class StringBuilder1 {

	public static void main(String[] args) {
		//Useing StringBulider for Reverse String Value
		String idName="Vishal";
		//create Instance of stringBulider
		StringBuilder object=new StringBuilder();
		object.append(idName);//append means joining 
		object.reverse();
		System.out.println("Print Reverse String:"+object);
		

	}

}
