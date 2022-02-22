package registration;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class UserRegistration {

	public boolean isValidFirstName(String firstName) {
		String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(firstNameRegex);
		java.util.regex.Matcher m = p.matcher(firstName);
		boolean b = m.matches();
		return b;
	}
	
	public boolean isValidLastName(String LastName) {
		String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(firstNameRegex); 
		java.util.regex.Matcher m = p.matcher(LastName);
		boolean b = m.matches();
		return b;
	}
	

		


	public boolean isValidMobileNo(String MobileNo) {
		String MobileNoRegex = "[0-9]{2}\\s[1-9]{1}[0-9]{9}";;
		Pattern p = Pattern.compile(MobileNoRegex); 
		java.util.regex.Matcher m = p.matcher(MobileNo);
		boolean b = m.matches();
		return b;

	}
} 
