package main.java.org.algodsa;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to Integer
 */
public class RomanToInteger {
    /**
     * Constructor
     */
    public RomanToInteger(){}

    /**
     * <h4><a href="https://leetcode.com/problems/roman-to-integer/description/">Roman to Integer</a></h4>
     * @param s String
     * @return integer
     */
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = getStringIntegerMap();

        int value = 0;

        int i = 0;
        while (i < s.length()){
            if (((s.length() - i) - 1 >= 1) && romanNumerals.get(s.charAt(i)) < romanNumerals.get(s.charAt(i+1))){
                value += romanNumerals.get(s.charAt(i+1)) - romanNumerals.get(s.charAt(i));
                i = i + 2;
            } else {
                value += romanNumerals.get(s.charAt(i));
                i++;
            }
        }

        return value;
    }

    private Map<Character, Integer> getStringIntegerMap() {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        return romanNumerals;
    }
}
