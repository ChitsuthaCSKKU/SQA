package sqa.main;

public class Strings {
	
	public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
	
	public static boolean isPalindrome(String text) {
	    String clean = text.replaceAll("\\s+", "").toLowerCase();
	    int length = clean.length();
	    int forward = 0;
	    int backward = length - 1;
	    while (backward > forward) {
	        char forwardChar = clean.charAt(forward++);
	        char backwardChar = clean.charAt(backward--);
	        if (forwardChar != backwardChar)
	            return false;
	    }
	    return true;
    }
	
	public static boolean isNull(String text) {
		return text == null;
	}
	
	public static boolean isEmpty(String text) {
		return text.isEmpty();
	}
}
