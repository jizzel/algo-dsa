package main.java.org.algodsa;

/**
 * This class provides a solution to count the number of seniors (age above 60)
 * based on citizen details provided in an array of strings.
 */
public class NumberOfSeniorCitizens {

    /**
     * Constructor
     */
    public NumberOfSeniorCitizens(){}

    /**
     * <h4><a href="https://leetcode.com/problems/number-of-senior-citizens/description/">Number of Senior Citizens</a></h4>
     * Counts the number of senior citizens whose age is greater than 60.<br>
     * <br>
     * Each string in the array represents a citizen's details, where the age
     * is encoded in the 12th and 13th characters (index 11 and 12) of the string.<br>
     * The method extracts the age, checks if it is greater than 60,
     * and increments the count accordingly.<br>
     * <br>
     * @param details an array of strings, each representing a citizen's details.
     *                The age of each citizen is embedded in the string
     *                at positions 11 and 12.
     * @return the number of senior citizens (age > 60).
     */
    public int countSeniors(String[] details) {
        int seniorCount = 0;
        for (String citizen : details) {
            int age = ((citizen.charAt(11) - '0') * 10) + citizen.charAt(12) - '0';
            seniorCount = age > 60 ? seniorCount + 1 : seniorCount;
        }
        return seniorCount;
    }
}
