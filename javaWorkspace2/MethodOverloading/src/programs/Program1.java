package programs;

public class Program1 
{
 static int plusMethod(int x,int y)//static method with integer datatype
 {
	 return x+y;
 }
 static double plusMethod(double a,double b)// static method with double datatype
 {
	 return a+b;
 }
 public static void main(String[] args) 
{
    int name1=plusMethod(8,5);
    double name2=plusMethod(12.5,12.5);
    System.out.println("integer Value Print:"+name1);
    System.out.println("Double Value Print:"+name2);
}
}
// methodoverloading--> means in the class have multiple methods have create
//          same name but passing different parameter is know as methodoverloading.
//   -->by chainging the datatype.
//   -->by chainging the parameter.
//