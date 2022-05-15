package arraysPrograms;

public class ReverseOrder1 {
public static void main(String[] args) {
	//declared array and reverse the array
	int [] arr=new int[] {11,22,33,44,55};
	System.out.println("***Orignal Array Print***");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	System.out.println("***Array in Reverse Order***");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]+" ");
	}
	
}
}
