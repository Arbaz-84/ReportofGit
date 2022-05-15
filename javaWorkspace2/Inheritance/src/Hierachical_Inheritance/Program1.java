package Hierachical_Inheritance;
class Animal
{
	void eat()
	{
		System.out.println("Eating******");
	}
}
class Dog extends Animal
{
   double numberOfDog=8;
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meowing****");
	}
}
public class Program1 
{
   public static void main(String[] args)
   {
	//create Cat class object 
	   Cat r=new Cat();
	   r.eat();
	   r.meow();
	//create dog object
	 Dog a=new Dog(); 
	   System.out.println("Number of Dogs: "+a.numberOfDog);
   }
}
