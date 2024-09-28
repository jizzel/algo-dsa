package main.java.org.algodsa;

/**
 * Add Binary
 */
public class AddBinary {
    /**
     * Constructor
     */
    public AddBinary(){}

    /**
     * <h4><a href="https://leetcode.com/problems/add-binary/">Add Binary</a></h4>
     * Adds two binary strings and returns their sum as a binary string.<br>
     * <br>
     * The method simulates binary addition, similar to how addition is performed manually with digits. <br>
     * It iterates through the binary strings from the least significant bit (rightmost) to the most significant bit (leftmost),
     * calculating the sum of corresponding bits, considering any carry from the previous addition. <br>
     * <br>
     * The result is constructed in reverse order (from least significant bit to most significant bit) and then reversed at the end
     * to produce the correct binary sum.<br>
     * <br>
     * Time Complexity: O(max(n, m)) - where n and m are the lengths of the binary strings `a` and `b`. The loop iterates through
     * the longer of the two strings.
     * Space Complexity: O(max(n, m)) - for storing the resulting binary string, which could be at most one bit longer than
     * the longer input string.<br>
     * <br>
     * Algorithm:<br>
     * 1. Initialize a `StringBuilder` to store the result.<br>
     * 2. Initialize a carry variable to 0.<br>
     * 3. Set up two pointers, `i` and `j`, starting at the end of the binary strings `a` and `b` respectively.<br>
     * 4. Loop until both strings are exhausted and there is no carry:<br>
     *    - If the current pointer is within bounds, convert the current character to its integer value; otherwise, use 0.<br>
     *    - Calculate the sum of the two bits and the carry.<br>
     *    - Determine the new carry by dividing the sum by 2.<br>
     *    - Append the remainder of the sum divided by 2 to the result.<br>
     * 5. Reverse the `StringBuilder` and convert it to a string for the final result.<br>
     *
     * @param a the first binary string
     * @param b the second binary string
     * @return the sum of the binary strings `a` and `b` as a binary string
     */
    public String addBinary(String a, String b) {
        // Declare a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Declare and initialize carry to 0
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        // Loop through the binary strings until both strings are exhausted
        while (i >= 0 || j >= 0 || carry > 0) {
            // If the current index is within bounds, convert the character to an integer; otherwise, use 0
            int aa = i >= 0 ? (a.charAt(i--) - '0') : 0;
            int bb = j >= 0 ? (b.charAt(j--) - '0') : 0;

            // Calculate the sum of the current digits and the carry
            int sum = aa + bb + carry;

            // Update carry
            carry = sum / 2;

            // Append the current bit (sum modulo 2) to the result
            result.append(sum % 2);
        }

        // Reverse the result and convert it to a string
        return result.reverse().toString();
    }
}
