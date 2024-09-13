package main.java.org.algodsa;

import java.util.*;

/**
 * Leetcode Java Solutions
 */
public class Solution {

    /**
     * Default constructor for the Solution class.
     * This constructor initializes the Solution class.
     */
    public Solution() {
        // Initialization code (if any) goes here
    }

    /**
     * <h4><a href="https://leetcode.com/problems/excel-sheet-column-number/description/">Excel Sheet Column Number</a></h4>
     * Converts an Excel sheet column title (e.g., "A", "AB") to its corresponding column number.<br>
     * <br>
     * Time Complexity: O(n)<br>
     * Space Complexity: O(1)<br>
     * <br>
     * Algorithm:<br>
     * 1. Initialize a variable `result` to store the final column number and set it to 0.<br>
     * 2. Iterate through each character in the `columnTitle` string from left to right:<br>
     *    - Convert the character to its numeric value using the formula: `currentValue = currentChar - 'A' + 1`.<br>
     *      (Note: This leverages ASCII values, where 'A' corresponds to 1, 'B' to 2, and so on.)<br>
     *    - Update the `result` by multiplying the current `result` by 26 (for the 26 letters of the alphabet)<br>
     *      and adding `currentValue`.<br>
     *      - This can be represented as: `result = result * 26 + currentValue`.<br>
     * 3. Once the loop completes, `result` will contain the column number corresponding to the input `columnTitle`.<br>
     * 4. Return `result`.<br>
     * <br>
     * @param columnTitle the Excel sheet column title as a String
     * @return the corresponding column number as an int
     */
    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i=0;i<columnTitle.length();i++){
            int charNum = (columnTitle.charAt(i) - 'A') + 1;
            result *= 26;
            result += charNum;
        }
        return result;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/length-of-last-word/description/">Length of Last Word</a></h4>
     * Returns the length of the last word in the given string.<br>
     * <br>
     * The method first skips any trailing spaces at the end of the string. Then, it counts the number of characters
     * in the last word until it encounters a space or the beginning of the string.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the string `s`. <br>
     * Space Complexity: O(1) - constant space usage. <br>
     * <br>
     * Algorithm:<br>
     * 1. Initialize a variable `i` to the index of the last character in the string.<br>
     * 2. Skip any trailing spaces by decrementing `i` until a non-space character is found or `i` becomes negative.<br>
     * 3. Initialize a `count` variable to 0 to keep track of the length of the last word.<br>
     * 4. Iterate through the string from right to left, counting characters until a space is encountered or `i` becomes negative.<br>
     * 5. Return the `count`, which represents the length of the last word.<br>
     * <br>
     * @param s the input string
     * @return the length of the last word in the string
     */
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                ++count;
            } else {
                break;
            }
            i--;
        }
        return count;
    }



    /**
     * <h4><a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">Find the Index of the First Occurrence in a String</a></h4>
     * Implements the `strStr()` function, which locates the first occurrence of the substring `needle`
     * in the string `haystack`.<br>
     * <br>
     * Time Complexity: O(n * m) - where n is the length of `haystack` and m is the length of `needle`.<br>
     * Space Complexity: O(1) - constant space usage.<br>
     * <br>
     * Algorithm:<br>
     * 1. If `needle` is longer than `haystack`, return -1 immediately since it can't be a substring.<br>
     * 2. Iterate through `haystack` up to the point where `needle` could still fit:<br>
     *    - For each position `i`, compare the substring of `haystack` starting at `i` with `needle`.<br>
     *    - Use an inner loop to compare each character of `needle` with the corresponding character in `haystack`.<br>
     *    - If all characters match, return the current index `i`.<br>
     * 3. If no match is found after the loop, return -1.<br>
     * <br>
     * @param haystack the string in which to search for the substring
     * @param needle the substring to find within `haystack`
     * @return the index of the first occurrence of `needle` in `haystack`, or -1 if `needle` is not found
     */
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && needle.charAt(j) == haystack.charAt(i + j)) {
                if (j == needle.length() - 1) return i;
                j++;
            }
        }
        return -1;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/repeated-substring-pattern/">Repeated Substring Pattern</a></h4>
     * Checks if the given string `s` can be constructed by repeating a substring of itself.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the string `s`.<br>
     * Space Complexity: O(n) - due to the creation of the `doubleStr` string.<br>
     * <br>
     * Algorithm:<br>
     * 1. Concatenate the string `s` with itself to form `doubleStr`.<br>
     * 2. Remove the first and last characters from `doubleStr` to avoid false positives.<br>
     * 3. Check if the original string `s` is a substring of this modified `doubleStr`.<br>
     * 4. If `s` is found within `doubleStr`, return `true`, indicating that `s` can be constructed
     *    by repeating a substring. Otherwise, return `false`.<br>
     * <br>
     * @param s the input string to check for repeated substring pattern
     * @return `true` if the string can be constructed by repeating a substring, otherwise `false`
     */
    public static boolean repeatedSubstringPattern(String s) {
        String doubleStr = s + s;
        doubleStr = doubleStr.substring(1, doubleStr.length() - 1);
        return doubleStr.contains(s);
    }

    /**
     * <h4><a href="https://leetcode.com/problems/to-lower-case/">To Lower Case</a></h4>
     * Converts all uppercase characters in the given string `s` to lowercase without using
     * built-in methods like `toLowerCase()`.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the string `s`.<br>
     * Space Complexity: O(n) - for storing the character array.<br>
     *
     * Algorithm:<br>
     * 1. Convert the string `s` into a character array, `str`.<br>
     * 2. Calculate the ASCII offset between lowercase and uppercase letters: `offset = 'a' - 'A'`.<br>
     * 3. Loop through each character in `str`:<br>
     *    - If the character is an uppercase letter (between 'A' and 'Z'):<br>
     *      - Convert it to its corresponding lowercase letter by adding the `offset` to its ASCII value.<br>
     *      - Replace the original character in the array with the new lowercase character.<br>
     * 4. Convert the modified character array back to a string.<br>
     * 5. Return the resulting string.<br>
     * <br>
     * @param s the input string to be converted to lowercase
     * @return a new string with all uppercase characters converted to lowercase
     */
    public static String toLowerCase(String s) {
        char[] str = s.toCharArray();
        int offset = 'a' - 'A';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                int charValue = offset + s.charAt(i);
                str[i] = (char) charValue;
            }
        }

        return new String(str);
    }

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
    public static List<String> fizzBuzz(int n) {
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


    /**
     * <h4><a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a></h4>
     * Finds the longest common prefix string among an array of strings.<br>
     * <br>
     * The method works by initially assuming the first string in the array (`strs[0]`) as the common prefix.<br>
     * It then iteratively compares this prefix with each subsequent string in the array. If the current string
     * does not start with the assumed prefix, the prefix is shortened by removing characters from the end until
     * the current string starts with the prefix. This process continues until either a common prefix is found for
     * all strings or the prefix becomes empty, indicating that there is no common prefix.<br>
     * <br>
     * Time Complexity: O(S) - where S is the sum of all characters in all strings. In the worst case,
     * the algorithm compares each character of every string.<br>
     * Space Complexity: O(1) - as no extra space is used except for a few variables.<br>
     * <br>
     * Algorithm:<br>
     * 1. Initialize the `prefix` with the first string in the array.<br>
     * 2. Iterate over each string in the array starting from the second string:<br>
     *    - While the current string does not start with the `prefix`, shorten the `prefix` by one character
     *      from the end.<br>
     *    - If the `prefix` becomes empty, return an empty string.<br>
     * 3. After checking all strings, return the `prefix`, which now represents the longest common prefix.<br>
     *
     * @param strs an array of strings to find the longest common prefix
     * @return the longest common prefix string among the input strings; if none exists, returns an empty string
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/detect-capital/">Detect Capital</a></h4>
     * Determines if the usage of capital letters in a word is correct according to some defined rules.<br>
     * <br>
     * The method checks the first two characters of the word to determine the pattern of capitalization.<br>
     * If the first character is lowercase and the second is uppercase, it immediately returns `false` as this
     * does not conform to any of the valid capitalization patterns. Then, for the rest of the word, it checks
     * if all characters follow the pattern established by the first two characters. If any character violates
     * this pattern, the method returns `false`. Otherwise, it returns `true`.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the word, as each character is checked once.<br>
     * Space Complexity: O(1) - only a few variables are used for comparisons.<br>
     * <br>
     * Algorithm:<br>
     * 1. If the word has only one character, return `true` since a single character can be either uppercase or lowercase.<br>
     * 2. Check if the first character is lowercase and the second character is uppercase:<br>
     *    - If true, return `false` because this pattern is invalid.<br>
     * 3. Iterate through the rest of the word starting from the third character:<br>
     *    - Ensure that the capitalization of each character matches the pattern set by the first two characters.<br>
     *    - If a mismatch is found, return `false`.<br>
     * 4. If no mismatches are found, return `true`.<br>
     *
     * @param word the input word to check for correct capital usage
     * @return `true` if the capitalization in the word is correct according to the rules, otherwise `false`
     */
    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;

        if (Character.isLowerCase(word.charAt(0)) && !Character.isLowerCase(word.charAt(1))) return false;

        for (int i = 2; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(1)) != Character.isUpperCase(word.charAt(i))) return false;
        }

        return true;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/word-pattern/description/">Word Pattern</a></h4>
     * Determines if a given string `s` follows the pattern defined by the string `pattern`.<br>
     * <br>
     * Each character in the `pattern` string represents a unique pattern for corresponding words in the string `s`.<br>
     * The method checks if each unique character in `pattern` maps to a unique word in `s` and vice versa, ensuring
     * that the mapping is consistent throughout the entire string.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the string `s` or `pattern`, as each character and word is processed once.<br>
     * Space Complexity: O(n) - for storing the map of characters to words.<br>
     *
     * Algorithm:<br>
     * 1. Split the input string `s` into an array of words using whitespace as a delimiter.<br>
     * 2. Check if the length of the array matches the length of the `pattern`. If not, return `false`.<br>
     * 3. Initialize a map to store the mapping between characters in the `pattern` and words in the array.<br>
     * 4. Iterate through each character in the `pattern` and the corresponding word:<br>
     *    - If the character is already mapped to a different word, return `false`.<br>
     *    - If the word is already mapped to a different character, return `false`.<br>
     *    - Update the map with the current character-word pair.<br>
     * 5. If all checks pass, return `true`.<br>
     * <br>
     * @param pattern a string representing the pattern to be checked
     * @param s a string where words need to follow the pattern defined by `pattern`
     * @return `true` if the string `s` follows the pattern, otherwise `false`
     */
    public static boolean wordPattern(String pattern, String s) {
        String[] strs = s.split("\\s+");

        // Check that the length of the pattern and the array of strings are equal
        if (strs.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentStr = strs[i];

            // Check if the map already contains the current character
            if (map.containsKey(currentChar)) {
                // If the mapped value does not match the current string, return false
                if (!currentStr.equals(map.get(currentChar))) return false;
            } else {
                // If the map does not contain the current character
                // but contains the current string (word), return false
                if (map.containsValue(currentStr)) return false;

                // Update the map with the current character and string
                map.put(currentChar, currentStr);
            }
        }

        return true;
    }



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
    public static String addBinary(String a, String b) {
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

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-preorder-traversal/">Binary Tree Preorder Traversal</a></h4>
     * Performs a preorder traversal on a binary tree. <br>
     * <br>
     * In preorder traversal, the nodes are recursively visited in this order:<br>
     * 1. Visit the current node.<br>
     * 2. Traverse the left subtree.<br>
     * 3. Traverse the right subtree.<br>
     * <br>
     * The method uses a helper function `preOrder` to recursively traverse the tree
     * and add the values of the nodes to a result list.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once.<br>
     * Space Complexity: O(n) - for the result list. The recursion stack space is O(h), where h is the height of the tree.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return a list of integers representing the values of the nodes in preorder
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return preOrder(root, result);
    }

    /**
     *  Helper method
     * @param node TreeNode
     * @param result result
     * @return end
     */
    private static List<Integer> preOrder(TreeNode node, List<Integer> result) {
        if (node == null) return result;

        result.add(node.val);         // Visit the current node
        preOrder(node.left, result);  // Traverse the left subtree
        preOrder(node.right, result); // Traverse the right subtree

        return result;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-inorder-traversal/description/">Binary Tree Inorder Traversal</a></h4>
     * Performs an inorder traversal on a binary tree.<br>
     * <br>
     * In inorder traversal, the nodes are recursively visited in this order:<br>
     * 1. Traverse the left subtree.<br>
     * 2. Visit the current node.<br>
     * 3. Traverse the right subtree.<br>
     * <br>
     * The method uses a helper function `inorder` to recursively traverse the tree
     * and add the values of the nodes to a result list.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once.<br>
     * Space Complexity: O(n) - for the result list. The recursion stack space is O(h), where h is the height of the tree.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return a list of integers representing the values of the nodes in inorder
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return inorder(root, result);
    }

    /**
     * Helper method
     * @param node TreeNode
     * @param res result
     * @return end
     */
    private static List<Integer> inorder(TreeNode node, List<Integer> res) {
        if (node == null) return res;

        inorder(node.left, res);  // Traverse the left subtree
        res.add(node.val);        // Visit the current node
        inorder(node.right, res); // Traverse the right subtree

        return res;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-postorder-traversal/description/">Binary Tree Postorder Traversal</a></h4>
     * Performs a postorder traversal on a binary tree.<br>
     * <br>
     * In postorder traversal, the nodes are recursively visited in this order:<br>
     * 1. Traverse the left subtree.<br>
     * 2. Traverse the right subtree.<br>
     * 3. Visit the current node.<br>
     * <br>
     * The method uses a helper function `postOrder` to recursively traverse the tree
     * and add the values of the nodes to a result list.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once.
     * Space Complexity: O(n) - for the result list. The recursion stack space is O(h), where h is the height of the tree.
     *
     * @param root the root node of the binary tree
     * @return a list of integers representing the values of the nodes in postorder
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return postOrder(root, result);
    }

    /**
     * Helper method
     * @param node TreeNode
     * @param result result
     * @return end
     */
    private static List<Integer> postOrder(TreeNode node, List<Integer> result) {
        if (node == null) return result;

        postOrder(node.left, result);  // Traverse the left subtree
        postOrder(node.right, result); // Traverse the right subtree
        result.add(node.val);          // Visit the current node

        return result;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-level-order-traversal/description/">Binary Tree Level Order Traversal</a></h4>
     * Performs a level-order traversal (also known as breadth-first traversal) on a binary tree.<br>
     * <br>
     * Level-order traversal visits nodes level by level, from left to right. This method
     * constructs a list of lists where each inner list contains the values of nodes at a specific level
     * of the tree.<br>
     * <br>
     * The method uses two helper functions:<br>
     * 1. `getTreeHeight` to determine the height of the tree.<br>
     * 2. `getLevelOrder` to collect nodes at a specific level.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once.<br>
     * Space Complexity: O(n) - for storing the result list and the recursion stack space.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return a list of lists, where each inner list contains the values of nodes at that level
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        // Get the height of the tree
        int height = getTreeHeight(root);

        // Traverse each level
        for (int level = 0; level < height; level++) {
            List<Integer> levelNodes = new ArrayList<>();
            getLevelOrder(root, level, levelNodes);
            if (!levelNodes.isEmpty()) {
                result.add(levelNodes);
            }
        }

        return result;
    }

    /**
     * Helper method to collect nodes at a specific level.<br>
     * <br>
     * This method recursively traverses the tree to collect nodes at a given level.<br>
     * <br>
     * @param root the current node in the binary tree
     * @param stepsRemaining the remaining levels to traverse
     * @param list the list to which node values at the current level will be added
     */
    private static void getLevelOrder(TreeNode root, int stepsRemaining, List<Integer> list) {
        if (root == null) return;

        if (stepsRemaining == 0) {
            list.add(root.val); // Add node value to list
            return;
        }

        // Recur for left and right children with decremented level
        getLevelOrder(root.left, stepsRemaining - 1, list);
        getLevelOrder(root.right, stepsRemaining - 1, list);
    }

    /**
     * Helper method to calculate the height of the tree.<br>
     * <br>
     * The height of a binary tree is the length of the longest path from the root to a leaf.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return the height of the tree
     */
    private static int getTreeHeight(TreeNode root) {
        if (root == null) return 0;

        // Get the height of left and right subtrees
        int lHeight = getTreeHeight(root.left);
        int rHeight = getTreeHeight(root.right);

        // The height of the tree is the maximum height of the subtrees plus one for the current node
        return Math.max(lHeight, rHeight) + 1;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/">Binary Tree Level Order Traversal II</a></h4>
     * Performs a level-order traversal of a binary tree and returns the node values
     * level-by-level from bottom to top.<br>
     * <br>
     * This method uses a queue to traverse the tree level by level, collecting the values
     * at each level and storing them in a list of lists. Finally, the result is reversed
     * so that levels are ordered from bottom to top.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once.<br>
     * Space Complexity: O(n) - for storing the result list and the queue.<br>
     *
     * @param root the root node of the binary tree
     * @return a list of lists, where each inner list contains the values of nodes at that level, ordered from bottom to top
     */
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        // Define the return variable
        List<List<Integer>> result = new ArrayList<>();

        // Safety check
        if (root == null) return result;

        // Declare a queue and add the root node
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Perform level-order traversal
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> subResult = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if(node != null) {
                    subResult.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }

            result.add(subResult);
        }

        // Reverse the result to get bottom-to-top order
        Collections.reverse(result);
        return result;
    }

    /**
     * <h4><a href="https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/description/">Kth Largest Sum in a Binary Tree</a></h4>
     * Returns the k-th largest level sum in a binary tree.<br>
     * <br>
     * This method performs a level-order traversal of the binary tree to compute the sum of
     * node values at each level. The sums are then sorted in descending order, and the
     * k-th largest sum is returned.<br>
     * <br>
     * Time Complexity: O(n log n) - where n is the number of levels in the tree, primarily due to sorting.<br>
     * Space Complexity: O(n) - for storing the sums of the levels.<br>
     * <br>
     * @param root the root node of the binary tree
     * @param k the position of the largest level sum to return (1-based index)
     * @return the k-th largest level sum, or -1 if k is out of bounds
     */
    public static long kthLargestLevelSum(TreeNode root, int k) {
        // Declare a list to store the level sums
        List<Long> result = new ArrayList<>();

        // Perform level-order traversal and sum node values at each level
        doLevelOrder(root, result);

        // Sort the sums in descending order
        result.sort(Collections.reverseOrder());

        // Return the k-th largest sum if within bounds
        if (k > result.size()) return -1;

        return result.get(k - 1);
    }

    /**
     * Helper method to perform a level-order traversal and calculate the sum of node values at each level.<br>
     * <br>
     * This method uses a queue to traverse the tree level by level, summing the node values
     * at each level and storing the sum in the provided list.<br>
     * <br>
     * @param root the root node of the binary tree
     * @param array the list to store the sum of node values at each level
     */
    public static void doLevelOrder(TreeNode root, List<Long> array) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Perform level-order traversal
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    sum += node.val;

                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            array.add(sum);
        }
    }

    /**
     * <h4><a href="https://leetcode.com/problems/invert-binary-tree/description/">Invert Binary Tree</a></h4>
     * Inverts a binary tree by swapping the left and right child of every node recursively.<br>
     * <br>
     * Inversion means that for each node, its left and right children are swapped.<br>
     * <br>
     * @param root the root of the binary tree
     * @return the root of the inverted binary tree
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree, as we need to visit each node once.<br>
     * Space Complexity: O(h) - where h is the height of the tree due to the recursive call stack. In the worst case,
     * this can be O(n) for a skewed tree.<br>
     */
    public static TreeNode invertTree(TreeNode root) {
        // Base case: If the node is null, there's nothing to invert
        if (root == null) return null;

        // Temporarily store the left child
        TreeNode temp = root.left;

        // Recursively invert the right subtree and assign it to the left child
        root.left = invertTree(root.right);

        // Recursively invert the left subtree and assign it to the right child
        root.right = invertTree(temp);

        // Return the current root after inversion
        return root;
    }

    // variable for calculating the diameter of a tree in the subsequent method
    static int diameter = 0;

    /**
     * <h4><a href="https://leetcode.com/problems/diameter-of-binary-tree/">Diameter of Binary Tree</a></h4>
     * Computes the diameter of a binary tree. The diameter is defined as the longest path
     * between any two nodes in the tree, which may or may not pass through the root.<br>
     * <br>
     * The diameter is the maximum sum of the heights of the left and right subtrees for any node.<br>
     * <br>
     * @param root the root of the binary tree
     * @return the diameter of the binary tree
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes, since we need to visit each node once.<br>
     * Space Complexity: O(h) - where h is the height of the tree, due to the recursive call stack.<br>
     */

    public static int diameterOfBinaryTree(TreeNode root) {
        // Calculate the height of the tree, while updating the diameter
        height(root);
        return diameter;
    }

    /**
     * Helper function to compute the height of the tree.<br>
     * While computing the height, it also updates the diameter.<br>
     *
     * @param node the current node in the binary tree
     * @return the height of the current subtree
     */
    public static int height(TreeNode node) {
        // Base case: if the node is null, its height is 0
        if (node == null) return 0;

        // Recursively calculate the height of the left and right subtrees
        int left = height(node.left);
        int right = height(node.right);

        // Update the diameter if the current path (left + right) is larger than the previously known diameter
        diameter = Math.max(diameter, left + right);

        // Return the height of the current node (1 + maximum height of its children)
        return Math.max(left, right) + 1;
    }


}
