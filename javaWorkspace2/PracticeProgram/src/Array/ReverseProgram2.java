package Array;

public class ReverseProgram2 {
     public static void main(String[] args) {
		int arr[]= {51,52,53,54,55,56};
		System.out.println("*****Orignal Array*******");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("*****Reverse Array*******");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		//Find Duplicate Element in array
		System.out.println("Duplicate Element in array");
		int arr1[]= {22,88,44,66,22,77,88,44};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
					System.out.println(arr1[j]);
			}
		
		}
		//Find sum of array element 
		System.out.println("Sum of array element");
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum=sum+arr1[i];
		}
	    System.out.println(sum);     }
}
