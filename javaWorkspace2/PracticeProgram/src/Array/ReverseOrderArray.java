package Array;

public class ReverseOrderArray {
public static void main(String[] args) {
	int []arr= {11,22,33,44,55};
	//Normal flow of array
	System.out.println("Orignal array order");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println();
	System.out.println("Array is Reverse Order");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
}
}
