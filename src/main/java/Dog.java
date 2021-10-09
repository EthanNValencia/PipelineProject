
/***
 * Dog class definition. 
 * @author Ethan J. Nephew
 */
public class Dog {
	
	private String name; 
	private String breed;
	private int age;
	
	/***
	 * Three parameter Dog constructor. 
	 * @param name String that will be the name. 
	 * @param breed String that will be the breed. 
	 * @param age Number that will be the age. 
	 */
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	/***
	 * Two parameter Dog constructor. 
	 * @param name String that will be the name. 
	 * @param breed String that will be the breed. 
	 */
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	/***
	 * Zero parameter default constructor. 
	 */
	public Dog() {
	
	}
	
	/***
	 * This is meant to simulate the behavior of barking. The Dog can bark. 
	 * @return The Dog barking
	 */
	public String bark() {
		return "Woof!";
	}
	
	/***
	 * Getter for the Dog name. 
	 * @return The name string. 
	 */
	public String getName() {
		return name;
	}
	
	/***
	 * Setter for the Dog name.
	 * @param name Requires the string that will be assigned as the name. 
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/***
	 * Getter for the Dog breed. 
	 * @return The breed string. 
	 */
	public String getBreed() {
		return breed;
	}
	
	/***
	 * Setter for the Dog breed.
	 * @param name Requires the string that will be assigned as the breed. 
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	/***
	 * Getter for the Dog age. 
	 * @return The age as a number. 
	 */
	public int getAge() {
		return age;
	}

	/***
	 * Setter for the Dog age.
	 * @param name Requires the number that will be assigned as the age. 
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/***
	 * Overridden toString method that returns the contents of the object variables as a string. 
	 */
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}	
	
}
