package arrayPracticeProgram;

public class ArrayRevrese1 
{
    public static void main(String[] args)
    {
		int[] arr={1,2,3,4,5,6,7,8,9};
		System.out.println("***********Orignal Array Print**********");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("***********Reverse Array Print**********");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("***********Reverse Array Print**********");
		int arr3[]= {9,8,7,6,5,4,3,2,1};
		for(int i=arr3.length-1;i>=0;i--)
		{
			System.out.print(arr3[i]);
		}
		System.out.println();
		System.out.println("***********Orignal Array Print**********");
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]);
		}
	}
}
