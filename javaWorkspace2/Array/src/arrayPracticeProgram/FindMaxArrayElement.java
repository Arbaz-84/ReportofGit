package arrayPracticeProgram;

public class FindMaxArrayElement {
    public static void main(String[] args) {
		int arr[]= {25,11,7,75,56};
		//Initialize max with first element of array
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Largest element present in array:::"+max);
	
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Largest element present in array:::"+min);
		
    }
}
