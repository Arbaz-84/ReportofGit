package thisKeywords;

public class ThisKeyword2 {
	int x;
   ThisKeyword2(int x)
	{
		System.out.println("Local variable x: "+x);
		System.out.println("Global variable x: "+this.x);
		System.out.println("Local variable x: "+x);
		System.out.println("Globale variable x: "+this.x);
	}
    public static void main (String []args)
    {
    	ThisKeyword2 myobj =new ThisKeyword2(45);
    	System.out.println("Value of x: "+myobj.x);
    }
}