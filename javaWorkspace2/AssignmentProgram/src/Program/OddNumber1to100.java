package Program;

public class OddNumber1to100 {
    public static void main(String[] args) {
		int number=100;
		System.out.println("List of odd number from 1to 100:"+number);
	   
		for(int i=1;i<=number;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
    }
}
