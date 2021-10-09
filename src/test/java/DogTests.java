import org.testng.annotations.Test;
import org.testng.Assert;

// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.DisplayName;


/***
 * Unit tests for the Dog class. 
 * @author Ethan J. Nephew
 */
public class DogTests {
	
	/*
	@Test
	public void test_fail() {
		Assert.assertEquals("Right", "Left");
	}
	*/
	
	@Test
	public void test_DogClass_Equals() {
		Dog dog = new Dog();
		Assert.assertEquals(Dog.class, dog.getClass());
	}
	
	@Test
	public void test_Dog_NoException() {	
		try {
			Dog dog = new Dog();
		} catch(Exception e) {
			Assert.fail("Instantiation of a Dog object threw an exception. This shouldn't happen.");
		}
	}
	
	@Test
	public void test_DogThreeParamConstructor_NotNull() {
		Dog dog = new Dog("Woofy","Hound", 12);
		Assert.assertNotNull(dog.getAge());
		Assert.assertNotNull(dog.getName());
		Assert.assertNotNull(dog.getBreed());
	}
	
	@Test
	public void test_DogThreeParamConstructor_Equals() {
		Dog dog = new Dog("Woofy","Hound", 12);
		Assert.assertEquals(12, dog.getAge());
		Assert.assertEquals("Woofy", dog.getName());
		Assert.assertEquals("Hound", dog.getBreed());
	}
	
	@Test
	public void test_TwoDog_NotEqual() {
		Dog dogOne = new Dog("Woofy","Hound", 12);
		Dog dogTwo = new Dog("Woofy","Hound", 12);
		Assert.assertNotEquals(dogOne, dogTwo);
	}
	
	@Test
	public void test_DogTwoParamConstructor_NotNull() {
		Dog dog = new Dog("Woofy","Hound");
		Assert.assertNotNull(dog.getName());
		Assert.assertNotNull(dog.getBreed());
	}
	
	@Test
	public void test_DogNoParamConstructor_NotNull() {
		Dog dog = new Dog();
		Assert.assertNotNull(dog);
	}
	
	@Test
	public void test_DogSetGetName_Equals() {
		Dog dog = new Dog();
		dog.setName("Fred");	
		Assert.assertEquals("Fred", dog.getName());
	}
	
	@Test
	public void test_DogSetGetBreed_Equals() {
		Dog dog = new Dog();
		dog.setBreed("Pitbull");	
		Assert.assertEquals("Pitbull", dog.getBreed());
	}
	
	@Test
	public void test_DogSetGetAge_Equals() {
		Dog dog = new Dog();
		dog.setAge(24);	
		Assert.assertEquals(24, dog.getAge());
	}
	
	@Test
	public void test_DogToString() {
		Dog dog = new Dog("Woofy","Hound", 12);
		Assert.assertEquals("Dog [name=Woofy, breed=Hound, age=12]", dog.toString());
	}
	
	@Test
	public void test_DogToStringEmpty() {
		Dog dog = new Dog();
		Assert.assertEquals("Dog [name=null, breed=null, age=0]", dog.toString());
	}
	
	@Test
	public void test_DogBark() {
		Dog dog = new Dog();
		Assert.assertEquals("Woof!", dog.bark());
	}

}
