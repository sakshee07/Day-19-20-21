package registration;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestUserRegistrationLastName {

		UserRegistration user = new UserRegistration();
		
		@Test
		public void testLastNameWithFirstCharCapAndMoreThanThreeSmallChar_ThenPass() {
			assertTrue(user.isValidLastName("Kalpesh"));
			}
		
		@Test
		public void testLastNameWithFirstCharCapAndMoreThanTwoSmallChar_ThenPass() {
			assertTrue(user.isValidLastName("Ram"));
			}
		
		@Test
		public void testLastNameWithFirstTwoCharCap_ThenFail() {
			assertFalse(user. isValidLastName("AB"));
			}
		@Test
		public void testLastNameWithFirstCharCapAndSecondCharSmall_ThenFail() {
			assertFalse(user. isValidLastName("Xy"));
			}
		@Test
		public void testLastNameWithFirstCharCapAndNextTwoCharSmallThenCap_ThenFail() {
			assertFalse(user. isValidLastName("VinIt "));
			}
		
		@Test
		public void testLastNameWithAllCharSmall_ThenFail() {
			assertFalse(user. isValidLastName("girish "));
			}
	}
