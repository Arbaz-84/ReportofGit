package arrayPracticeProgram;

public class ArrayDuplicateElement01 {
    public static void main(String[] args) {
		int arr1[]= {1,2,5,8,1,2,9,5,4,3,8};
		//Print Orignal Element of Array
		System.out.println("*********Print Orignal Element*********");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		//Print the Duplicate Array Element 
		System.out.println("*********Print Duplicate Element*********");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
					System.out.println(arr1[j]);
			}
		}
	}
}
