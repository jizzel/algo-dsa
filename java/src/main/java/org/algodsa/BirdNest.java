package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a bird building its nest in a forest.
 * The bird starts at a given position and collects sticks by alternating
 * search directions (right then left) until it gathers at least 100 units of stick length.
 */
public class BirdNest {

    /**
     * Default constructor.
     */
    public BirdNest() {}

    /**
     * <h4>Build Bird Nest</h4>
     * <br><br>
     * Simulates the bird collecting sticks from the forest to build a nest.
     * It starts at a given position and alternates between searching right and left
     * to find sticks (represented by positive integers) until the total stick length is at least 100.
     * <br>
     * Time Complexity: O(n), where n is the length of the forest array.
     *   - In the worst case, it may scan the entire array to collect enough sticks.
     * <br>
     * Space Complexity: O(k), where k is the number of stick indices collected into the result list.
     * <br><br>
     * @param forest an array where each element represents the length of a stick at that position;
     *               zero or negative values indicate absence of usable sticks.
     * @param bird   the index position in the array where the bird starts.
     * @return an array of indices from which the bird collects sticks to build the nest.
     */
    public int[] buildNest(int[] forest, int bird) {
        List<Integer> stickIndices = new ArrayList<>();
        boolean moveRight = true;
        int left = bird - 1, right = bird + 1;
        int totalSticks = 0;

        while(totalSticks < 100){
            int foundStickIndex = -1;
            if(moveRight){
                while(right < forest.length){
                    if(forest[right] > 0){
                        foundStickIndex = right;
                        right++;
                        break;
                    }
                    right++;
                }
            }
            else{
                while(left >= 0){
                    if(forest[left] > 0){
                        foundStickIndex = left;
                        left--;
                        break;
                    }
                    left--;
                }
            }

            moveRight = !moveRight;

            if(foundStickIndex != -1){
                stickIndices.add(foundStickIndex);
                totalSticks += forest[foundStickIndex];
            }
        }

        int[] result = new int[stickIndices.size()];

        for(int i = 0; i < stickIndices.size(); i++){
            result[i] = stickIndices.get(i);
        }

        return result;
    }
}
