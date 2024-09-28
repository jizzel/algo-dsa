package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 */
public class FizzBuzz {
    /**
     * Constructor
     */
    public FizzBuzz (){}

    /**
     * <h4><a href="https://leetcode.com/problems/fizz-buzz/">Fizz Buzz</a></h4>
     * Generates a list of strings representing the FizzBuzz sequence from 1 to `n`.<br>
     * <br>
     * Time Complexity: O(n) - where n is the input number, as each number from 1 to `n` is processed once.<br>
     * Space Complexity: O(n) - to store the list of strings.<br>
     * <br>
     * Algorithm:<br>
     * 1. Initialize an empty list `answer` to store the FizzBuzz results.<br>
     * 2. Iterate over each number from 1 to `n`:<br>
     *    - If the number is divisible by both 3 and 5, add "FizzBuzz" to the list.<br>
     *    - If the number is divisible by 3 only, add "Fizz" to the list.<br>
     *    - If the number is divisible by 5 only, add "Buzz" to the list.<br>
     *    - If the number is not divisible by 3 or 5, add the number itself as a string.<br>
     * 3. Return the list `answer` containing the FizzBuzz sequence.<br>
     * <br>
     * @param n the upper limit of the sequence (inclusive)
     * @return a list of strings representing the FizzBuzz sequence from 1 to `n`
     */
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = i + 1;
            answer.add(num % 3 == 0 && num % 5 == 0 ? "FizzBuzz" :
                    (num % 3 == 0) ? "Fizz" :
                            (num % 5 == 0) ? "Buzz" :
                                    String.valueOf(num));
        }

        return answer;
    }
}
