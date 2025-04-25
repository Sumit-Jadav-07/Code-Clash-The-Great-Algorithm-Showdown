// Implement a method to check if a given string is a palindrome, ignoring spaces and case sensitivity.

public class Palindrome {

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        boolean result = isPalindrome(input);
        System.out.println("Input : " + input + "\nIs palindrome? ->" + result);
    }

}