package Program;

public class PrintEvenNumber1To100 {

   public static void main(String[] args) {
	
	   int number=100;
	   System.out.println("List of even number from 1 to 100::"+number);
	   for(int i=1;i<=number;i++)
	   {
		   //logic to check if the number is even or not
		   //if i%2 is equal to zero the number is even
		   if(i%2==0)
		   {
			   System.out.print(i+" ");
		   }
	   }
	   int number1=200;
	   System.out.println("List of even number from 100 to 200::"+number1);
	  
	   for(int i=101;i<=number1;i++)
	   {
		   if(i%2==0)
		   {
			   System.out.print(i+" ");
		   }
	   }
}
}
