package arraysPrograms;

public class Program2
{
public static void main(String[] args) 
{
	int a[]= {33,2,4,5};
	//declaration,initialization
	//printing array
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println("*************");
	
	int b[]=new int[6];
	b[0]=11;
	b[1]=22;
	b[2]=33;
	b[3]=44;
	b[4]=55;
	//useing for loop
	for(int i=0;i<a.length;i++)
	{
		System.out.println(b[i]);
	}
	
}
}
