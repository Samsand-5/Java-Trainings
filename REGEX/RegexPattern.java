package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String args[]) {
		String str="Hello World \ntoday is dry day";
		String regex="[atod]";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()) {
			System.out.print(matcher.group());
		}
	}
}
