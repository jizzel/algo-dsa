package main.java.org.algodsa;

/**
 * This class provides a method to repeatedly calculate the digit sum of a string until
 * the length of the resulting string is less than or equal to a given threshold.
 */
public class CalculateDigitSumOfAString {
    /**
     * Constructor
     */
    public CalculateDigitSumOfAString(){}

    /**
     * <h4><a href="https://leetcode.com/problems/calculate-digit-sum-of-a-string/description/">2243. Calculate Digit Sum of a String</a></h4>
     * Repeatedly calculates the sum of digits in groups of size 'k' and replaces
     * the original string with the sum until the length of the string is less than or equal to 'k'.<br>
     * <br>
     * @param s the input string consisting of digits
     * @param k the group size threshold
     * @return the resulting string after repeatedly calculating the digit sum
     * <br>
     * The method works by dividing the input string into groups of size 'k', calculating
     * the sum of digits for each group, and concatenating those sums into a new string.<br>
     * This process is repeated recursively until the length of the resulting string is less than or equal to 'k'.<br>
     * <br>
     * Example:<br>
     * For input string "1111122222" and k = 3, the process works as follows:<br>
     * First pass: "111" -> 3, "112" -> 4, "222" -> 6<br>
     * New string: "346"<br>
     * Then, if k = 3, the process stops as the new string has a length ≤ k.<br>
     * <br>
     * Time Complexity: O(n * log n), where n is the length of the string.<br>
     * In each iteration, the string size reduces by approximately k, and the process repeats until n ≤ k.<br>
     * <br>
     * Space Complexity: O(n), since a new string is created in each iteration of the recursion.<br>
     */
    public String digitSum(String s, int k) {
        int n = s.length();
        if( n <= k) return s;

        StringBuilder ans = new StringBuilder();

        int i = 0;
        while(i<n){
            int groupSum = 0;
            int end = Math.min(n, i+k);
            for(int j=i; j < end; j++){
                groupSum += s.charAt(j) - '0';
            }
            ans.append(groupSum);
            i += k;
        }

        return digitSum(ans.toString(), k);
    }
}