package arraysPrograms;

public class ReverseOrder {
 public static void main(String[] args) 
 {
	//initilize array
	 int[]arr =new int[] {1,2,3,4,5};
	 System.out.println("Original array");
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[i]+" ");
	 }
	 System.out.println();
	 System.out.println("Array is Reverse order");
	 for(int i=arr.length-1;i>=0;i--)
	 {
		 System.out.println(arr[i]+" ");
	 }
 }
 
}
