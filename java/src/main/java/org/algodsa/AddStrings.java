package main.java.org.algodsa;

/**
 * This class provides a method to add two non-negative numbers represented as strings without converting them to integers directly.
 */
public class AddStrings {
    /**
     * Constructor
     */
    public AddStrings(){}

    /**
     * <h4><a href="https://leetcode.com/problems/add-strings/">415. Add Strings</a></h4>
     * Adds two non-negative numbers represented as strings and returns the result as a string.
     * The method mimics manual addition by iterating over the digits from right to left, handling carries, and building the result string.
     * <br>
     * @param num1 the first non-negative number represented as a string
     * @param num2 the second non-negative number represented as a string
     * @return the sum of num1 and num2 represented as a string
     * <br>
     * Time Complexity: O(max(n, m)), where n and m are the lengths of num1 and num2 respectively.
     * The function iterates through the digits of both strings.
     * <br>
     * Space Complexity: O(max(n, m)), the result string and intermediate values take space proportional to the maximum length of the two inputs.
     */
    public String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder ans = new StringBuilder();

        int i = num1.length() - 1, j = num2.length() - 1;

        // Loop through the strings from right to left, adding corresponding digits
        while (i >= 0 || j >= 0 || carry > 0) {
            int numA = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int numB = j >= 0 ? num2.charAt(j--) - '0' : 0;

            int sum = numA + numB + carry;
            carry = sum / 10;

            ans.append(sum % 10);
        }

        // Reverse the result and return
        return ans.reverse().toString();
    }
}

