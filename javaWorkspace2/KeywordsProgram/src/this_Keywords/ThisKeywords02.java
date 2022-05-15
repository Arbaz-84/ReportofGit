package this_Keywords;

public class ThisKeywords02
{
   int variable=51;
   public static void main(String[] args) 
   {
	// Create Object for calling the Non-static member
	   ThisKeywords02 b=new ThisKeywords02();
	   b.method(20);
	   b.method();
	   

   }
   void method(int variable)
   {
	   System.out.println("Value of Local Variable:"+variable);//20
	   variable =10;
	   System.out.println("Value of Local Variable:"+variable);//10
	   this.variable=variable;
	   System.out.println("Value of Instance variable:"+variable);//10
	   System.out.println("Value of Local variable:"+this.variable);//10
	   System.out.println("Value of Instance variable:"+this.variable);//10
	   
   }
   void method()
   {
	   int variable=40;
	   System.out.println("Value of Instance variable:"+this.variable);//10
	   System.out.println("Value of Local variable:"+variable);//40
	   this.variable=variable;
	   System.out.println("Value of Instance variable:"+this.variable);//40
	   System.out.println("Value of Local variable:"+variable);//40
	   
   }
}
