package test.java.org.algodsa;

import main.java.org.algodsa.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    @Test
    void testTypicalCase() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = solution.maxProfit(prices);
        assertEquals(5, profit); // Buy at 1, sell at 6
    }

    @Test
    void testDecreasingPrices() {
        int[] prices = {7, 6, 4, 3, 1};
        int profit = solution.maxProfit(prices);
        assertEquals(0, profit); // No profit possible
    }

    @Test
    void testIncreasingPrices() {
        int[] prices = {1, 2, 3, 4, 5};
        int profit = solution.maxProfit(prices);
        assertEquals(4, profit); // Buy at 1, sell at 5
    }

    @Test
    void testEmptyArray() {
        int[] prices = {};
        int profit = solution.maxProfit(prices);
        assertEquals(0, profit); // No data
    }

    @Test
    void testSingleDay() {
        int[] prices = {5};
        int profit = solution.maxProfit(prices);
        assertEquals(0, profit); // Not enough days to buy and sell
    }

    @Test
    void testTwoDaysProfit() {
        int[] prices = {1, 2};
        int profit = solution.maxProfit(prices);
        assertEquals(1, profit); // Buy at 1, sell at 2
    }

    @Test
    void testTwoDaysNoProfit() {
        int[] prices = {2, 1};
        int profit = solution.maxProfit(prices);
        assertEquals(0, profit); // No profit possible
    }

    @Test
    void testAllSamePrices() {
        int[] prices = {3, 3, 3, 3, 3};
        int profit = solution.maxProfit(prices);
        assertEquals(0, profit); // No gain
    }
}
