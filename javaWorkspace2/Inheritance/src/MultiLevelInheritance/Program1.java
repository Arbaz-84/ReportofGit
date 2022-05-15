package MultiLevelInheritance;
class Animal
{
	//create void metthod
    void eat()
    {
	System.out.println("Eating....");
    }
}
class Dog extends Animal
{
	//Create void method
	void bark()
	{
		System.out.println("Braking....");
	}
}
class BabyDog extends Dog
{
    //create void mehtod 
	void weep()
	{
		System.out.println("Weeping...");
	}
}
public class Program1
{
    public static void main(String[] args) 
   {
	// Create BabyDog class object for calling void method 
    	BabyDog k1=new BabyDog();
    	k1.eat();
    	k1.bark();
    	k1.weep();
    
   }
}
