package ShawnROGradyTestdomeJava;

import java.util.stream.IntStream;

public class Palindrome2 {
    public static boolean isPalindrome(String word) {
        char[] letters = word.toLowerCase().toCharArray();
    	
        int leftCursor = 0;
        int rightCursor = letters.length - 1;
        
    	while (true) {
    		if (leftCursor >= rightCursor)
    			return true;
    		
    		if (letters[leftCursor] != letters[rightCursor])
    			return false;
    		
    		leftCursor++;
    		rightCursor--;
 
    	}
    }
    
    public static boolean isPalindrome_loop(String word) {
        
        for (int i=0; i<word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(word.length()-i-1))) {
                return false;
            }
            
        }
        return true;
    }
    
    public static boolean isPalindrome_IntStream(String word) {
            String wordInLowerCases = word.toLowerCase(); //change the word to lower cases
            int wordLength = wordInLowerCases.length();  //word length into local varaible
            return IntStream                             //starting stream
                    .range(0, wordLength / 2)              // making the range from 0 to half of the length
                    .noneMatch(i -> wordInLowerCases.charAt(i) != wordInLowerCases.charAt(wordLength - i - 1)); //checking is there are none, none matching pair of chars in a word

    }

    
    public static void main(String[] args) {
        System.out.println(Palindrome2.isPalindrome("Deleveled"));
        // System.out.println(Palindrome2.isPalindrome_IntStream("Deleveled"));
        // System.out.println(Palindrome2.isPalindrome_loop("Deleveled"));
    }
}
