package javaProgram;

public class Student {
  int rollno;
  float fee;
  Student (int rollno,float fee) { //rollno=101 ,fee=5000
       System.out.println("Local rollno: "+rollno);
       System.out.println("Local fee: "+fee);
       rollno =rollno;
       fee= fee;
       System.out.println("Local rollno: "+rollno);
       System.out.println("Local fee: "+fee);
  }
  void display() {
	  System.out.println(rollno+" "+ fee);
  }
  static class Thiskeyword {
	  static int rollNum ,res;;
	  public static void main(String args[])  {
		  Student s1=new Student(101, 5000f);
		  s1.display();
		  Student s2= new Student (102,6000f);
		  s2.display();
		  int rollnum=65;
		  System.out.println("access Local rollNum: "+rollNum);
	      System.out.println("access global res: "+Thiskeyword.rollNum);
	      System.out.println("access global res:"+res);
		  
	  }
  }
}