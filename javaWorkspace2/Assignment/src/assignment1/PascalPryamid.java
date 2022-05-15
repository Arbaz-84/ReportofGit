package assignment1;

public class PascalPryamid {
	public static void main(String[] args) {
int row=6,num;
for(int i=0;i<row;i++)
{
	for(int j=row;j>i;j--)
	{
		System.out.println(" ");
	}
	num=1;
	for(int j=0;j<=i;j++)
	{
		System.out.println(num+" ");
		num=num*(i-j)/(j+1);
	}
	System.out.println();
}
}
	static void pyramid2()
	{
		int row=5,ct=1;
		for(int i=row;i>0;i--)
		{
			for(int j=1;j<=i*2;j++)
			{
				System.out.println(" ");
			}
			for(int j=1;j<=ct;j++)
			{
				System.out.println(j+" ");
			
			}
			for(int j=ct-1;j>=1;j--)
			{
				System.out.println(j+" ");
			}
			System.out.println();
			ct++;
		}
	}
}
