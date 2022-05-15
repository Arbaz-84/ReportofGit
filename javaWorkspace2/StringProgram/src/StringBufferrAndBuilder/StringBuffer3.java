package StringBufferrAndBuilder;

public class StringBuffer3 {

	public static void main(String[] args) {
		//Useing StringBuffer for reverse String
		String employeeName="Vishal kumar";
		//object create stringBuffer class 
		StringBuffer obj=new StringBuffer (employeeName);
		obj.reverse();
		System.out.println(obj);

	}

}
