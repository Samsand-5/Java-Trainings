package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength {
	public static void main(String args[]) {
		String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
		String password="Strong@123";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		
		System.out.println(matcher.matches());
	}
}
