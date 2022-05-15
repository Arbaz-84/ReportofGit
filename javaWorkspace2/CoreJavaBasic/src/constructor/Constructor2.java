package constructor;

public class Constructor2 {
       int roll;
       double salary;
       Constructor2(int r,double a)
       {
    	   roll=r;
    	   salary=a;
       }
       void display()
       {
    	   System.out.println(roll +" "+ salary);
       }
       public static void main(String[] args) 
       {
		Constructor2 C1=new Constructor2 (101,25000.4);
		C1.display();
		Constructor2 C2=new Constructor2 (201,26000.5);
		C2.display();
		
	   }
}
