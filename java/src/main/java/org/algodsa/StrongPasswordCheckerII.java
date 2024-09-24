package main.java.org.algodsa;

/**
 * This class provides a method to check if a given password meets strong password criteria.
 */
public class StrongPasswordCheckerII {

    /**
     * Constructor
     */
    public StrongPasswordCheckerII(){}
    /**
     * <h4><a href="https://leetcode.com/problems/strong-password-checker-ii/description/">Strong Password Checker II</a></h4>
     * Checks if the given password is strong according to specified criteria<br>
     * <br>
     * @param password the password to check
     * @return true if the password is strong, false otherwise
     * <br>
     * Time Complexity: O(n), where n is the length of the password. We iterate through the password once.<br>
     * Space Complexity: O(1), as we use a fixed amount of space regardless of the input size.<br>
     */
    public boolean strongPasswordCheckerII(String password) {
        // If password length is less than 8, it's automatically weak
        if (password.length() < 8) return false;

        // Flags to check the conditions
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // The string of allowed special characters
        String specialChar = "!@#$%^&*()-+";

        // Iterate through each character of the password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check if two consecutive characters are identical
            if (i > 0 && ch == password.charAt(i - 1)) return false;

            // Check if the character is a special character
            if (specialChar.indexOf(ch) >= 0) hasSpecial = true;

            // Check if the character is a digit
            if (ch >= '0' && ch <= '9') hasDigit = true;

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') hasLower = true;

                // Check if the character is an uppercase letter
            else if (ch >= 'A' && ch <= 'Z') hasUpper = true;
        }

        // Return true only if all conditions are met
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}
