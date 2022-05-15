package constructionChaing;

public class MyClass {
	public int empSalary;
	public String empName;
	public String address;
	//default constructor****
	MyClass()
	{
		//call the constructor with(string name)
		this("Chaitanya");
		
	}
	MyClass(String name)
	{
		//call the constructor with (String,int)
		this(name,12000);
	}
	MyClass(String name,int sal)
	{
		//call the constructor with (String,int,string)
		this(name,sal,"Pune");
	}
	MyClass(String name,int sal,String addr)
	{
		this.address=addr;
		this.empName=name;
		this.empSalary=sal;
			
	}
	void display()
	{
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+empSalary);
		System.out.println("Employee Address:"+address);
	}
	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.display();
		
	}

}
