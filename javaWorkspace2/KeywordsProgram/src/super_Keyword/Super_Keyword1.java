package super_Keyword;
class Animal
{
String colour="White";

}
class Dog extends Animal
{
String colour="Black";

void display()
{
System.out.println(colour);
System.out.println(super.colour);
}
}

public class Super_Keyword1
{
     public static void main(String[] args) 
   {
	Dog s1=new Dog();
	s1.display();
   }
}
