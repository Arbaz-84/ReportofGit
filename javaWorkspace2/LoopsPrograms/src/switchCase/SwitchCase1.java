package switchCase;

public class SwitchCase1 
{
public static void main(String[] args) 
{
	int value=2;
	switch (value)
	{
	case 1:
		System.out.println("Hi Today is Monday..");
		break;
	case 2:
		System.out.println("Hi Today is Tuesday..");
		break;
	case 3:
		System.out.println("Hi Today is Thursday..");
		default :
			System.out.println("Sorry none of your cases matched");
			break;
	}
}
}
