
/***
 * Main entry point for the program. 
 * @author Ethan J. Nephew
 *
 */
public class Main {
	
	/***
	 * Main method for the program. Demonstrates the use of the Dog object. 
	 * @param args
	 */
    public static void main(String[] args) {
    	Dog dog = new Dog("Kali", "Pitbull", 12);
		System.out.println(dog.getName() + " is a " + dog.getBreed() + ".");
		System.out.println(dog.getName() + " is a " + dog.getClass().getSimpleName() + ".");
		System.out.println(dog.getName() + " is a " + dog.getAge() + " years old.");
		System.out.println(dog.bark() + " "  + dog.bark() + " "  + dog.bark());
    }

    
    
}


































