package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ThirdMaximumNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ThirdMaximumNumberTest {

    private ThirdMaximumNumber solution;

    @BeforeEach
    public void setUp() {
        solution = new ThirdMaximumNumber();
    }

    @Test
    public void testThirdMax_DistinctNumbers() {
        int[] nums = {3, 2, 1};
        assertEquals(1, solution.thirdMax(nums)); // Third max is 1
    }

    @Test
    public void testThirdMax_LessThanThreeDistinctNumbers() {
        int[] nums = {1, 2};
        assertEquals(2, solution.thirdMax(nums)); // No third max, return the maximum, which is 2
    }

    @Test
    public void testThirdMax_ContainsDuplicates() {
        int[] nums = {2, 2, 3, 1};
        assertEquals(1, solution.thirdMax(nums)); // Distinct numbers are 3, 2, 1; third max is 1
    }

    @Test
    public void testThirdMax_NegativeNumbers() {
        int[] nums = {1, -2, -3, 4};
        assertEquals(-2, solution.thirdMax(nums)); // Distinct numbers are 4, 1, -2, -3; third max is -2
    }

    @Test
    public void testThirdMax_AllIdenticalNumbers() {
        int[] nums = {2, 2, 2};
        assertEquals(2, solution.thirdMax(nums)); // All elements are identical, return the maximum, which is 2
    }

    @Test
    public void testThirdMax_MoreThanThreeDistinctNumbers() {
        int[] nums = {5, 3, 2, 1, 4};
        assertEquals(3, solution.thirdMax(nums)); // Third max is 3
    }

    @Test
    public void testThirdMax_ContainsZeros() {
        int[] nums = {0, -1, 1};
        assertEquals(-1, solution.thirdMax(nums)); // Distinct numbers are 1, 0, -1; third max is -1
    }

    @Test
    public void testThirdMax_SingleElement() {
        int[] nums = {10};
        assertEquals(10, solution.thirdMax(nums)); // Single element, return the only number
    }

    @Test
    public void testThirdMax_TwoElements() {
        int[] nums = {1, 1};
        assertEquals(1, solution.thirdMax(nums)); // No third max, return the max, which is 1
    }
}
