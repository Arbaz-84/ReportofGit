package scannerClass;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
	String s="Hello This is JavaTpoint";
	//create Scanner class object and pass string in it
	Scanner obj=new Scanner(s);
	System.out.println("Boolean Result: "+obj.hasNext());
	//print the string
	System.out.println("String Value: "+obj.nextLine());
	obj.close();
	System.out.println("------Enter Your Details-----");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name:");
	String name=scan.next();
	System.out.println("Name: "+name);
	System.out.print("Enter your age: ");
    int i=scan.nextInt();
    System.out.println("Age: "+i);
    System.out.println("Enter your salary:");
    double d=scan.nextDouble();
    System.out.println("Salary: "+d);
    scan.close();

	}

}
