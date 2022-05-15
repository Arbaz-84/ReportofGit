package arraysPrograms;

public class CopyElementOneArraytoUnotherArray
{
    public static void main(String[] args) 
    {
		//decleared array
    	int []arr1=new int[] {1,2,3,4,5};
    	//create another array aar2
    	int []arr2=new int[arr1.length];//.length   ==== length()
    	//copying all elements of one array to another array
    	for(int i=0;i<arr1.length;i++)
    	{
    		arr2[i]=arr1[i];
    		
    	}
    	//Displaying elements of array arr1 elements
    	System.out.println("Elements of Orignal Array:");
    	for(int i=0;i< arr1.length;i++)
    	{
    		System.out.println(arr1[i]+" ");
    	}
    	System.out.println();
    	
    	//Displaying elements of array arr2;
    	System.out.println("Elements of new array:");
    	for(int i=0;i<arr2.length;i++)
    		System.out.println(arr2[i]+" ");
	}
}
