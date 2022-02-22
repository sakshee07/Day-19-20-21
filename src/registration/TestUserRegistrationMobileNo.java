package registration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestUserRegistrationMobileNo {
	UserRegistration user;
	
	@Before 
	 public 
	 void init() {
		user = new UserRegistration();
	}
	
	@Test
	public void TestMobileNoWhenCountryCodewithFirstDigitIn6789AndTenDiOnly_thenPass(){
		equals(user.isValidMobileNo("9975510126"));
	}
	@Test
	public void TestMobileNoWhenCountryCodewithFirstDigitIn6789AndTenDiOnly_thenPass1(){
		equals(user.isValidMobileNo("6543218905"));
	}
	
}
