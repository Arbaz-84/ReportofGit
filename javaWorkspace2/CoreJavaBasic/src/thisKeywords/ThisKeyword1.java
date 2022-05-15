package thisKeywords;

public class ThisKeyword1 {
    int rollno;
    float fee;
    ThisKeyword1 (int rollno,float fee)
    {
    	System.out.println("Local rollno: "+rollno);
    	System.out.println("Local fee: "+fee);
    	this.rollno=rollno;
    	fee=this.fee;
    	System.out.println("Local rollno: "+rollno);
    	System.out.println("Local fee: "+fee);
    
    }
    void display()
    {
    	System.out.println(rollno+" "+fee);
    	
    }
}
    class Thiskeywords2
    {
    	static int rollno,res;;
    	public static void main (String[]args)
    	{
    		ThisKeyword1 S1=new ThisKeyword1(101,5000f);
    		S1.display();
    		ThisKeyword1 S2=new ThisKeyword1(102,6000f);
    		S2.display();
    		int rollnum=65;
    		System.out.println("access Local rollnum: "+rollno);
    		System.out.println("access global res: "+res);
    	}
    
    }
