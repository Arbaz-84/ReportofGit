package methodExample;

public class ReturnValue 
{
	void print(int a)
	{
		System.out.println("A="+a);
	}
	 int show(int a, int b)
	{
	    //int sum = a+b;
		
		return a-b;
	}
	
	 String display(String name, int age)
	 {
		 return name + "\n"+ age ;
	 }
	 
	
	
    public static void main(String[] args) {
		ReturnValue b=new ReturnValue();
		//b.print(10);
		//.out.println("Answer="+  b.show(40, 40));
		
		System.out.println("Name="+b.display("Arbaz",5));
		
		System.out.println(b.show(70,100));
	}
}
