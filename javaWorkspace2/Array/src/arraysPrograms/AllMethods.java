package arraysPrograms;

public class AllMethods
{
   public static void main(String[] args)
   {
	//String str1="Core Java Basic";
	//Useing Reverse 
	int arr[]= {11,22,33,44};
	System.out.println("Orignal Array");
	//Useing For loops for Orignal and Reverse Array
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Reverse Array");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}

   }
}
