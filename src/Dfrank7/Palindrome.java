package Dfrank7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Palindrome {
    public static boolean isPalindrome(String word) {
        List<Object> newWord = new ArrayList();
		char[] wordToChar = word.toCharArray();
    	for(int i = wordToChar.length-1; i>=0; i--) {
    		newWord.add(wordToChar[i]);
    	}
    	String arrays = newWord.toString();
    	String words = listToString(newWord);
    	if(word.toLowerCase().equals(words.toLowerCase())) {
        	return true;
        	}else {
        		return false;
    }
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
    public static String listToString(List<Object> list) {
        StringBuilder sb = new StringBuilder();

        for (Object object : list) {
            if (object != null) {
                if (object.getClass().isArray()) {
                    sb.append(Arrays.toString((Object[]) object));
                } else {
                    sb.append(object.toString());
                }
            }
        }
        return sb.toString();
    }
}
