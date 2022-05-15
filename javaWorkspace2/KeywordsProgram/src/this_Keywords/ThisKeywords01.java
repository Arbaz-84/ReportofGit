package this_Keywords;

public class ThisKeywords01 
{   int x;
    public ThisKeywords01(int x)
    {
    	System.out.println("Local variable x:"+x);
    	System.out.println("Global variable x:"+this.x);
    	this.x=x;
    	System.out.println("Local Variable x:"+x);
    	System.out.println("Global variable x:"+this.x);
    }
    public static void main(String[] args)
    {
		ThisKeywords01 obj=new ThisKeywords01(45);
		System.out.println("value of x="+obj.x);
	}
}
