package defaultConstructorProgram;

public class DefaultConstructor01 {
	//Create Deafult Constructor***
	void display()//Non-Static method or void Method
	{
		String name="Arbaz";
		System.out.println(name);
		System.out.println("****WELCOME JAVA**** ");
	}
	//Static method with default constructor***
	public void test()//Non-Static method
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		//Object Create for Calling Non-Static Method
		DefaultConstructor01 obj=new DefaultConstructor01();
		obj.display();
		obj.test();
		System.out.println("****Program End****");
	}

}
