package inheritanceProgram;

class A {
	static int a = 20;
	double number = 2000.76;
	int b = 20;
}

class B {
	static int x = 30;
	int q = 35;
	double salary = 35000.60;
}

class C {
	static int d = 55;
	int y = 4;
	double z = 313.50;
}

public class Inheritance0 {
	public static void main(String[] args) {

//******Access static member***************
		System.out.println("class A static member calling:="+A.a);
		System.out.println("class B static member calling:="+B.x);
		System.out.println("class C static member calling:="+C.d);
//Object creation for non static memeber
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
//*****Non-Static Member****************
		System.out.println("class A Non-Static member calling:"+obj1.number);
		System.out.println("class A Non-Static member calling:"+obj1.b);
		System.out.println("class B Non-Static member calling:"+obj2.q);
		System.out.println("class B Non-Static member calling:"+obj2.salary);
		System.out.println("class A Non-Static member calling:"+obj3.y);
		System.out.println("class A Non-Static member calling:"+obj3.z);
	}

}
