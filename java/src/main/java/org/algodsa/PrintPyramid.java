package main.java.org.algodsa;

/**
 * Print Pyramid
 */
public class PrintPyramid {

    /**
     * Constructor
     */
    public PrintPyramid(){}

    /**
     * Prints a pyramid of stars where the number of stars in each row
     * is determined by the first N odd numbers. Each row is centered
     * based on the row with the maximum number of stars.<br>
     * <br>
     * Time Complexity: O(n²) (due to the increasing number of stars per row).<br>
     * Space Complexity: O(n) (for the array of odd numbers and the strings created during each iteration).<br>
     * <br>
     * @param n the number of rows in the pyramid
     */
    public void printPyramid(int n) {
        int[] arr = firstNOdd(n);  // Get the first n odd numbers
        int maxStars = arr[arr.length - 1];  // Maximum stars in the last row

        // Loop through each row and print the stars
        for (int stars : arr) {
            int numOfSpaces = (maxStars - stars) / 2;  // Calculate leading spaces

            // Build the string with leading spaces and stars
            String row = " ".repeat(numOfSpaces) + "*".repeat(stars);

            // Print the row
            System.out.println(row);
        }
    }

    /**
     * Helper function
     * <br>
     * Generates an array containing the first N odd numbers.<br>
     * For example, if N = 3, the result will be [1, 3, 5].<br>
     * <br>
     * @param n the number of odd numbers to generate
     * @return an array of the first N odd numbers
     */
    public static int[] firstNOdd(int n) {
        int[] oddNums = new int[n];  // Array to store the odd numbers
        int i = 0;
        int num = 1;

        // Generate the first N odd numbers
        while (i < n) {
            oddNums[i++] = num;
            num += 2;
        }

        return oddNums;
    }
}
