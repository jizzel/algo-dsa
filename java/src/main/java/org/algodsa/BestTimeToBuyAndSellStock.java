package main.java.org.algodsa;

/**
 * A class to determine the maximum profit from a single buy and sell transaction
 * of a stock given the daily prices.
 */
public class BestTimeToBuyAndSellStock {

    /**
     * Default constructor.
     */
    public BestTimeToBuyAndSellStock() {}

    /**
     * <h4><a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">121. Best Time to Buy and Sell Stock</a></h4>
     * <br>
     * Calculates the maximum profit that can be achieved from a single buy and
     * sell transaction of the stock. Buying must occur before selling.
     * <br><br>
     * Time Complexity: O(n), where n is the number of days (length of the prices array).
     *   - We iterate through the array once to track the minimum price and compute the profit.
     * <br>
     * Space Complexity: O(1).
     *   - Only constant extra space is used for tracking `minPrice` and `maxProf`.
     * <br><br>
     * @param prices an array where each element represents the stock price on a given day.
     * @return the maximum profit possible. Returns 0 if no profit can be made.
     */
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProf = Math.max(maxProf, price - minPrice);
            }
        }

        return maxProf;
    }
}
