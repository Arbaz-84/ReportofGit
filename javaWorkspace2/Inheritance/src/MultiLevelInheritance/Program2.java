package MultiLevelInheritance;
class Engineering
{
	int numberOfCollege= 25;
}
class DyPatilCollege extends Engineering
{
   char gradeOfCollege='A';	
}
class Jspm extends DyPatilCollege
{
	int rankOfCollege= 1;
	
}
class SunjivaniCollege extends Jspm
{
	int employee=550;
}
public class Program2 
{
   public static void main(String[] args) 
   {
	//create SunjivaniCollege object and calling other class members
    SunjivaniCollege obj=new SunjivaniCollege();
    System.out.println("Engineering Number Of College: "+obj.numberOfCollege);
    System.out.println("Engineering Number Of College: "+obj.gradeOfCollege);
    System.out.println("Engineering Number Of College: "+obj.rankOfCollege);
    System.out.println("Engineering Number Of College: "+obj.employee);
    
   
   }
}
