package arraysPrograms;

public class LargestElement1 {
public static void main(String[] args) {
	//Initilize array
	int[] arr=new int[] {25,11,7,75,56};
	//Initialize max with first element
	int max=arr[0];
	//Useing For loop
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
			max=arr[i];
	}
	System.out.println("Largest element present in given array: "+max);
}
}
