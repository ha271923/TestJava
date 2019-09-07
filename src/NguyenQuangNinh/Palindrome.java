package NguyenQuangNinh;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        String result = new StringBuilder(word).reverse().toString();

        return word.toLowerCase().equals(result.toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deeveled"));
    }
}
