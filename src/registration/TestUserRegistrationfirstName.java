package registration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestUserRegistrationfirstName {
	UserRegistration user;
	
	@Before 
	 public void init() {
		user = new UserRegistration();
	}
	@Test
	public void testFirstNameWithFirstCharCapAndMoreThanThreeSmallChar_ThenPass() {
		assertTrue(user.isValidFirstName("Kalpesh"));
		}
	
	@Test
	public void testFirstNameWithFirstCharCapAndMoreThanTwoSmallChar_ThenPass() {
		assertTrue(user.isValidFirstName("Ram"));
		}
	
	@Test
	public void testFirstNameWithFirstTwoCharCap_ThenFail() {
		assertFalse(user.isValidFirstName("AB"));
		}
	@Test
	public void testFirstNameWithFirstCharCapAndSecondCharSmall_ThenFail() {
		assertFalse(user.isValidFirstName("Xy"));
		}
	@Test
	public void testFirstNameWithFirstCharCapAndNextTwoCharSmallThenCap_ThenFail() {
		assertFalse(user.isValidFirstName("VinIt "));
		}
	
	@Test
	public void testFirstNameWithAllCharSmall_ThenFail() {
		assertFalse(user.isValidFirstName("girish "));
		}
}



