package ClassWork;
//different classes 
/*
 *represents real world
 *easier to code and debug
 *easier to test + maintain (each class has its own data)
 *code reuse
 *
 *public and private classes. data in program can be private while interactive components are public.
 *private class data can't be accessed directly.
* public class/function can be accessed directly (interface).
* dependent on each other (public and private classes).
* function can not operate without the data(in the private class), but data is accessed through the function.
*
	//When we represent OO -> we write classes(class is like the object model).
	/*Before using class, there is object instances (coming from an object model).
	 * Scanner (class) scnr (object instance) = new (create memory) Scanner(System.in) (constructor w/ input parameter sys.in)
	 * The constructor has the same name as the class, its role is to initialize the object instance.
	Each class has its own method, 
*create object from other class and use 
* 
*/
public class OOP {
	private String Name;
	private int Rating;
	public void setName(String newName) {
		Name = newName;
	}
	public void setRating(int newRating) {
		Rating = newRating;
	}
	public void PrintRest() {
		System.out.println(Name + " " + Rating);
	}//must be called from main to be used
}
public class MyRes { //different file
public static void main(String[] args) {
	OOP restaurant1 = new OOP();
	restaurant1.setName("CC");
	restaurant1.setRating(8);
	restaurant1.PrintRest();
}
}


