package main;

public class ShiftCipher {
	
	static final int num_char = 26;    //number of elements in the set (all characters in the set)
	
	public String shift(String message, int key){
		
        StringBuilder stbuilder = new StringBuilder();
        char currentChar;
        int length = message.length();

        key = key%num_char;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
           
            if (currentChar > 'Z' || currentChar < 'A') {
                return "invalid";
            } else if ((char) (currentChar + key) > 'Z') {
                currentChar = (char) (currentChar - num_char);
            } else if ((char) (currentChar + key) < 'A'){
                currentChar = (char) (currentChar + num_char);
            }
            stbuilder.append((char) (currentChar + key));
        }

        return stbuilder.toString();
    }

}
