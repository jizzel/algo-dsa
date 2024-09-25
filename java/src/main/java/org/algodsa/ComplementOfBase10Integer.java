package main.java.org.algodsa;

/**
 * This class provides a method to find the complement of a given integer.<br>
 * The complement of a binary number is obtained by flipping each bit of its binary representation.<br>
 */
public class ComplementOfBase10Integer {

    /**
     * Constructor
     */
    public ComplementOfBase10Integer(){}

    /**
     * <a href="https://leetcode.com/problems/complement-of-base-10-integer/">Complement of Base 10 Integer</a>
     * Finds the complement of the given integer.<br>
     * <br>
     * @param n the integer whose complement is to be found
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
    public int bitwiseComplement(int n) {
        char[] numStr = Integer.toBinaryString(n).toCharArray();

        for(int i=0;i<numStr.length;i++){
            if(numStr[i] == '0') numStr[i] = '1';
            else numStr[i] = '0';
        }
        return Integer.parseInt(new String(numStr), 2);
    }

    /**
     * Alternative and efficient approach.<br>
     * Finds the complement of the given integer.<br>
     * <br>
     * @param n the integer whose complement is to be found
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
    public int bitwiseComplementOof1(int n) {
        if (n == 0) return 1;
        int result = 0;
        //use set to set the value of result in each bit
        int set = 1;
        while(n != 0) {
            //if last bit is 0 , set corresponding position of result to 1
            if((n&1)== 0) {
                result |= set;
            }
            //if last bit of num is 1, then do not need to set result
            set <<= 1; // left shift 1 bit
            n >>= 1;//right shift num, move right 1 bit
        }
        return result;
    }
}