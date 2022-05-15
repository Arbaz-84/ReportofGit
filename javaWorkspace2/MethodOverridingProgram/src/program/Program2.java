package program;

class Bank
{
    int getRateOfInterest()
    {
       return 0;
    }
}
class SBI extends Bank
{
    int getRateOfInterest()
    {
       return 8;
    }
}
class ICICI extends Bank
{
     int getRateOfInterest()
     {
       return 7;
     }
}
class AXIS extends Bank
{
      int getRateOfInterest()
      {
        return 9;
      }
}
class Program2{
public static void main(String[] args)
{
	// object create
	SBI a1=new SBI();
	ICICI a2=new ICICI();
	AXIS a3=new AXIS ();
	
	System.out.println("SBI Rate:"+a1.getRateOfInterest());
	System.out.println("ICICI Rate:"+a2.getRateOfInterest());
	System.out.println("AXIS Rate:"+a3.getRateOfInterest());
}
}
