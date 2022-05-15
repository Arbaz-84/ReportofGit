package thisKeywords;

public class ThisKeyword3 {
	int a;
	int b;
	ThisKeyword3(int a, int b)
	{
		this.a=a;
		this.b=b;
	
	}
   void display()
   {
	   System.out.println("a= "+a+"b= "+b);
	   
   }
   public static void main (String[]args)
   {
	   ThisKeyword3 object=new ThisKeyword3(10,20);
	   object.display();
	   System.out.println(object.a+" "+object.b);
	   
	   ThisKeyword3 object1=new ThisKeyword3(102,201);
	   object1.display();
	   System.out.println(object1.a+" "+object1.b);
   }
}
