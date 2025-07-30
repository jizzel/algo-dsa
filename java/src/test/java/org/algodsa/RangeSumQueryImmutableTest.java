package test.java.org.algodsa;

import main.java.org.algodsa.RangeSumQueryImmutable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangeSumQueryImmutableTest {

    @Test
    void testSumRange_Basic() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable rsq = new RangeSumQueryImmutable(nums);

        assertEquals(1, rsq.sumRange(0, 2));    // -2 + 0 + 3
        assertEquals(-1, rsq.sumRange(2, 5));   // 3 + (-5) + 2 + (-1)
        assertEquals(-3, rsq.sumRange(0, 5));   // sum of all elements
    }

    @Test
    void testSumRange_SingleElement() {
        int[] nums = {5, 8, -3, 7};
        RangeSumQueryImmutable rsq = new RangeSumQueryImmutable(nums);

        assertEquals(5, rsq.sumRange(0, 0));
        assertEquals(-3, rsq.sumRange(2, 2));
    }

    @Test
    void testSumRange_EntireArray() {
        int[] nums = {1, 2, 3, 4, 5};
        RangeSumQueryImmutable rsq = new RangeSumQueryImmutable(nums);

        assertEquals(15, rsq.sumRange(0, 4));
    }

    @Test
    void testSumRange_NegativeOnly() {
        int[] nums = {-1, -2, -3, -4};
        RangeSumQueryImmutable rsq = new RangeSumQueryImmutable(nums);

        assertEquals(-10, rsq.sumRange(0, 3));
        assertEquals(-5, rsq.sumRange(1, 2));
    }

    @Test
    void testSumRange_SameStartEndIndex() {
        int[] nums = {4, 9, -5, 6};
        RangeSumQueryImmutable rsq = new RangeSumQueryImmutable(nums);

        for (int i = 0; i < nums.length; i++) {
            assertEquals(nums[i], rsq.sumRange(i, i));
        }
    }
}
