package arraysPrograms;

public class Program1 
{
public static void main(String[] args) 
{
	//Declaration array and instantiation
	//Syntax: datatypes referVariable[]=new datdtype[size];
	int a[]=new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	//Way=1
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	
	//print result byusing for loop 
	System.out.println("*****************");
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
}
}
