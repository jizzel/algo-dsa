package main.java.org.algodsa;

/**
 * This class provides a method to find the complement of a given integer.<br>
 * The complement of a binary number is obtained by flipping each bit of its binary representation.<br>
 */
public class NumberComplement {

    /**
     * Constructor
     */
    public NumberComplement(){}

    /**
     * <a href="https://leetcode.com/problems/number-complement/">Number Complement</a>
     * Finds the complement of the given integer.<br>
     * <br>
     * @param num the integer whose complement is to be found
     * @return the complement of the integer in decimal form
     * <br>
     * The method converts the integer to its binary string form, flips each bit
     * (changing 0 to 1 and 1 to 0), and then converts the result back to a decimal integer.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of bits in the binary representation of the number.<br>
     * <br>
     * Space Complexity: O(n), where n is the number of bits in the binary representation,
     * due to the use of a character array to store the binary string.<br>
     */
    public int findComplement(int num) {
        char[] numStr = Integer.toBinaryString(num).toCharArray();

        for(int i = 0; i < numStr.length; i++){
            if(numStr[i] == '0') numStr[i] = '1';
            else numStr[i] = '0';
        }
        return Integer.parseInt(new String(numStr), 2);
    }

    /**
     * Alternative and efficient approach.<br>
     * Finds the complement of the given integer.<br>
     * <br>
     * @param num the integer whose complement is to be found
     * @return the complement of the integer in decimal form
     * <br>
     * The method converts the integer to its binary string form, flips each bit
     * (changing 0 to 1 and 1 to 0), and then converts the result back to a decimal integer.<br>
     * <br>
     * Time Complexity: O(1), where n is the number of bits in the binary representation of the number.<br>
     * <br>
     * Space Complexity: O(1), where n is the number of bits in the binary representation,
     * due to the use of a character array to store the binary string.<br>
     */
    public int findComplementOof1(int num) {
        int result = 0;
        //use set to set the value of result in each bit
        int set = 1;
        while(num != 0) {
            //if last bit is 0 , set corresponding position of result to 1
            if((num&1)== 0) {
                result |= set;
            }
            //if last bit of num is 1, then do not need to set result
            set <<= 1; // left shift 1 bit
            num >>= 1;//right shift num, move right 1 bit
        }
        return result;
    }
}