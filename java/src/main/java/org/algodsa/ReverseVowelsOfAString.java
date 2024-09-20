package main.java.org.algodsa;

public class ReverseVowelsOfAString {

    /**
     * Constructor
     */
    public ReverseVowelsOfAString(){}
    /**
     * <h4><a href="https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/1396622781/">Reverse Vowels of a String</a></h4>
     * Reverses the vowels in a given string.<br>
     * <br>
     * The method uses a two-pointer approach to swap vowels in the string, one pointer starting from the
     * beginning and the other from the end, until they meet. The method ensures that only vowels are swapped,
     * while other characters remain in their original positions.<br>
     * <br>
     * @param s The input string.
     * @return A new string with vowels reversed.
     */
    public String reverseVowels(String s) {
        // Convert the string into a mutable character array
        char[] str = s.toCharArray();

        // Two pointers, one starting from the beginning and one from the end
        int i = 0, j = s.length() - 1;

        // Continue until the two pointers meet
        while (i < j) {
            // If both str[i] and str[j] are vowels, swap them
            if (isVowel(str[i]) && isVowel(str[j])) {
                // Swap the characters at position i and j
                str[i] = s.charAt(j);
                str[j] = s.charAt(i);

                // Move both pointers inward
                i++;
                j--;
            }
            // If str[i] is not a vowel, move i to the right
            else if (!isVowel(str[i])) {
                i++;
            }
            // If str[j] is not a vowel, move j to the left
            else {
                j--;
            }
        }

        // Return the modified character array as a new string
        return new String(str);
    }

    // Helper method to check if a character is a vowel (case-insensitive)
    private boolean isVowel(char c){
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
}
