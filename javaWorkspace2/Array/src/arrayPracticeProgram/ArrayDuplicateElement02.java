package arrayPracticeProgram;

public class ArrayDuplicateElement02 {
     public static void main(String[] args) {
		int arrayElement[]= {22,35,46,35,23,46,56};
		System.out.println("**************");
		//Print Duplicate Array Element
		for(int i=0;i<arrayElement.length;i++)
		{
			for(int j=i+1;j<arrayElement.length;j++)
			{
				if(arrayElement[i]==arrayElement[j])
				System.out.println(arrayElement[j]);
			}
		}
	}
}
