package main.java.org.algodsa;

/**
 * This class provides a method to check if a given string is a valid palindrome,
 * considering only alphanumeric characters and ignoring cases.
 */
public class ValidPalindrome {

    /**
     * Default constructor.
     */
    public ValidPalindrome(){}

    /**
     * <h4><a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a></h4>
     * <br>
     * Determines whether the given string is a valid palindrome, considering only
     * alphanumeric characters and ignoring cases.
     * <br> <br>
     * Time Complexity: O(n), where n is the length of the input string.
     * - We use a two-pointer approach, scanning each character at most once.
     * <br>
     * Space Complexity: O(1), since we use only a few integer variables.
     * <br> <br>
     * @param s the input string
     * @return true if the input string is a palindrome (ignoring non-alphanumeric characters and case), false otherwise
     */
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            char a = s.charAt(i);
            char b = s.charAt(j);

            if (!((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9'))) {
                i++;
            } else if (!((b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z') || (b >= '0' && b <= '9'))){
                j--;
            } else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            } else {
                i++;
                j--;
            }
        }

        return true;
    }
}
