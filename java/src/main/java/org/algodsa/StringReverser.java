package main.java.org.algodsa;

/**
 * This class provides methods to reverse strings.
 */
public class StringReverser {

    /**
     * Default constructor.
     */
    public StringReverser() {}

    /**
     * Reverses the input string.
     * <br><br>
     * Time Complexity: O(n)
     *   - Where {@code n} is the length of the input string.
     * <br>
     * Space Complexity: O(n)
     *   - Creates a new string of the same length.
     * <br><br>
     * @param input the string to reverse
     * @return the reversed string
     */
    public String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        
        return reversed.toString();
    }
}