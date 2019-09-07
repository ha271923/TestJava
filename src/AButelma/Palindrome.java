/* 1) PALINDROME
 * 
 * A palindrome is a word that reads the same backward or forward.
 * Write a function that checks if a given word is a palindrome. 
 * Character case should be ignored.
 * 
 * For example, isPalindrome("Deleveled") should return true as 
 * character case should be ignored, resulting in "deleveled", which is a palindrome 
 * since it reads the same backward and forward.
 */

package AButelma;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        boolean palindrome = false;
        
        String backwards = "";
        
        word = word.toLowerCase();
        
        for (int i = word.length() - 1; i >= 0; i--) {
                backwards = backwards + word.charAt(i);
        }
        
        System.out.println(backwards);
        
        if (word.equals(backwards)) palindrome = true;
        
        return palindrome;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}