package inheritanceProgram;
//parent class
class A1{
	static int a=20;
	int b=30;
	double c= 12.35;
}
//child class
class B1 extends A1{
static int x=45;
float y=14.45f;
}
class C1 extends B1{
static String name="ClassName";
char grade ='D';

}

public class Inheritance1 {
	public static void main(String[] args) {
		// caling static member***********
		System.out.println("**************Static member value****************");
		System.out.println("Static member value:"+A1.a);
		System.out.println("Static member value:"+B1.x);
		System.out.println("Static member value:"+C1.name);
		//caling non-static members useing object creation
		C1 s1=new C1();
		System.out.println("*********Non-Static member value***********************");
		System.out.println("Non-Static member value:"+s1.b);
		System.out.println("Non-Static member value:"+s1.c);
		//System.out.println("Non-Static member value:"+s1.x);
		System.out.println("Non-Static member value:"+s1.y);
	    System.out.println("Non-Static member value:"+s1.grade);
	    B1 s2=new B1();
	    System.out.println("Non-Static member value:"+s2.b);
	    System.out.println("Non-Static member value:"+s2.c);
	    System.out.println("Non-Static member value:"+s2.y);
			
}
}
