package methodExample;

public class method2 {
   public static void main(String[] args) {
	   System.out.println("*********Program Start********");
	method2 sum=new method2();
	sum.display();
	sum.display(25,'A',24000);
	sum.display('A',24000,45);
	System.out.println("*********Program End********");
}
   int getNumber()
   {
	   return 25;
   }
   void display()
   {
	   System.out.println("********display() program will be Start********");
	   char garde= 'A';
	   int age=30,salary=35000;
	   System.out.println("Grade ofchar: "+garde);
	   System.out.println("Age of Employee: "+age);
	   System.out.println("Salary of Employee: "+salary);
	   System.out.println("********display() program will be End********");
   }
   void display(int age,char garde,int salary)
   {
	   System.out.println("********display(int,char,int) with parameter program will be start********");
	   System.out.println("Grade of char: "+garde);
	   System.out.println("Age of Employee: "+age);
	   System.out.println("Salary of Employee: "+salary);
	   System.out.println("********display(int,char,int) with parameter program will be End********");
   }
   void display(char grade,int salary,int age)
   {
	   System.out.println("********display(int,char,int) with parameter program will be start********");
	   System.out.println("char-int-int value print: "+grade+"\t"+salary+"\t"+age);
	   System.out.println("********display(int,char,int) with parameter program will be End********");
   }
}
