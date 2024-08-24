// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

/**
 * Main Class
 */
public class Main {
    /**
     * Default constructor for the Main class.
     * This constructor initializes the Main class.
     */
    public Main() {
        // Initialization code (if any) goes here
    }

    /**
     * Main method
     * @param args variable arguments
     */
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        System.out.println(Solution.titleToNumber("ZY"));
        System.out.println(Solution.lengthOfLastWord("Hello World"));
        System.out.println(Solution.strStr("sadbutsad", "sad"));
        System.out.println(Solution.repeatedSubstringPattern("abab"));
        System.out.println(Solution.toLowerCase("Hello"));
        System.out.println(Solution.fizzBuzz(3));
        System.out.println(Solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(Solution.detectCapitalUse("FFFf"));
        System.out.println(Solution.wordPattern("abba", "dog cat cat dog"));
        System.out.println(Solution.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));

    }
}