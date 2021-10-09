import org.testng.annotations.Test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

/***
 * Unit tests for the Dog class. 
 * @author Ethan J. Nephew
 *
 */
public class DogTests {
	
	@Test
	@DisplayName("Tests a Dog object is a member of the Dog class")
	public void test_DogClass_Equals() {
		Dog dog = new Dog();
		Assertions.assertEquals(Dog.class, dog.getClass());
	}
	
	@Test
	@DisplayName("Tests the Dog class does not throw exception")
	public void test_Dog_NoException() {	
		try {
			Dog dog = new Dog();
		} catch(Exception e) {
			Assertions.fail("Instantiation of a Dog object threw an exception. This shouldn't happen.");
		}
	}
	
	@Test
	@DisplayName("Tests Dog three parameter constructor for not null")
	public void test_DogThreeParamConstructor_NotNull() {
		Dog dog = new Dog("Woofy","Hound", 12);
		Assertions.assertNotNull(dog.getAge());
		Assertions.assertNotNull(dog.getName());
		Assertions.assertNotNull(dog.getBreed());
	}
	
	@Test
	@DisplayName("Tests Dog three parameter constructor for equality")
	public void test_DogThreeParamConstructor_Equals() {
		Dog dog = new Dog("Woofy","Hound", 12);
		Assertions.assertEquals(12, dog.getAge());
		Assertions.assertEquals("Woofy", dog.getName());
		Assertions.assertEquals("Hound", dog.getBreed());
	}
	
	@Test
	@DisplayName("Tests Dog three parameter constructor for not equals")
	public void test_TwoDog_NotEqual() {
		Dog dogOne = new Dog("Woofy","Hound", 12);
		Dog dogTwo = new Dog("Woofy","Hound", 12);
		Assertions.assertNotEquals(dogOne, dogTwo);
	}
	
	@Test
	@DisplayName("Tests Dog two parameter constructor for not null")
	public void test_DogTwoParamConstructor_NotNull() {
		Dog dog = new Dog("Woofy","Hound");
		Assertions.assertNotNull(dog.getName());
		Assertions.assertNotNull(dog.getBreed());
	}
	
	@Test
	@DisplayName("Tests Dog no parameter constructor")
	public void test_DogNoParamConstructor_NotNull() {
		Dog dog = new Dog();
		Assertions.assertNotNull(dog);
	}
	
	@Test
	@DisplayName("Tests Dog name setter and getter")
	public void test_DogSetGetName_Equals() {
		Dog dog = new Dog();
		dog.setName("Fred");	
		Assertions.assertEquals("Fred", dog.getName());
	}
	
	@Test
	@DisplayName("Tests Dog setter and getter")
	public void test_DogSetGetBreed_Equals() {
		Dog dog = new Dog();
		dog.setBreed("Pitbull");	
		Assertions.assertEquals("Pitbull", dog.getBreed());
	}
	
	@Test
	@DisplayName("Tests Dog age setter and getter")
	public void test_DogSetGetAge_Equals() {
		Dog dog = new Dog();
		dog.setAge(24);	
		Assertions.assertEquals(24, dog.getAge());
	}
	
	@Test
	@DisplayName("Tests Dog three parameter constructor")
	public void test_DogToString() {
		Dog dog = new Dog("Woofy","Hound", 12);
		Assertions.assertEquals("Dog [name=Woofy, breed=Hound, age=12]", dog.toString());
	}
	
	@Test
	@DisplayName("Tests Dog three parameter constructor")
	public void test_DogToStringEmpty() {
		Dog dog = new Dog();
		Assertions.assertEquals("Dog [name=null, breed=null, age=0]", dog.toString());
	}
	
	@Test
	@DisplayName("Tests Dog bark")
	public void test_DogBark() {
		Dog dog = new Dog();
		Assertions.assertEquals("Woof!", dog.bark());
	}

}
