package inheritanceProgram;
// MultiLevel Inheritance Type
//parent class
class Animal
{
 void eat()
 {
	 System.out.println("Animal can Eat");
 }
}
//Child class
class Dog extends Animal 
{
void bark()
{
System.out.println("Dog can Bark");
}
}
class Cat extends Dog
{
void Walk()
{
System.out.println("Cat can Walk");
}

}
public class Inheritance2 {

	public static void main(String[] args)
	{// Create Object 
		Cat object=new Cat();
		object.eat();
		object.bark();
		object.eat();
		
		

	}

}
