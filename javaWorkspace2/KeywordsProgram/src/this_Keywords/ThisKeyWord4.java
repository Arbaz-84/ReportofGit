package this_Keywords;

public class ThisKeyWord4 {
	//Global variable 
	int variable = 51;
	//float precentage=78.68f;
	
	public static void main(String[] args) {
		ThisKeyWord4 obj=new ThisKeyWord4();
		obj.method(20);
		obj.method();
		System.out.println("Value of  Instance variable: "+obj.variable);
		
	}
	//create void method
	void method(int variable)
	{
		System.out.println("Value Of Local Variable: "+variable);//20
		variable=10;
		System.out.println("Value Of Local Variable: "+variable);//10
		System.out.println("Value of Instance Variable: "+this.variable);//51
		this.variable=variable;
		System.out.println("Value of Local Variable: "+variable);//10
		System.out.println("Value of Instance Variable: "+variable);//10
		
	}
	void method()
	{
		int variable=40;
		System.out.println("Value of Instance Variable:"+this.variable);//10
		System.out.println("Value of Local Variable: "+variable);//40
		this.variable=variable;
		System.out.println("Value of Local variable: "+variable);//40
		System.out.println("Value of Instance Variable:"+this.variable);//40
	}

}
