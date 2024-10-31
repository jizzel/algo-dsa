package main.java.org.algodsa;

/**
 * This class provides a method to find the first bad version in a sequence of versions.
 * <br>
 * It extends VersionControl, which contains the method `isBadVersion(int version)` that returns
 * whether a given version is bad.
 */
public class FirstBadVersion extends VersionControl {

    /**
     * Constructor to initialize the first bad version.
     *
     * @param firstBadVersion the first bad version in the sequence
     */
    public FirstBadVersion(int firstBadVersion) {
        super(firstBadVersion);
    }

    /**
     * <h4><a href="https://leetcode.com/problems/first-bad-version/description/">278. First Bad Version</a></h4>
     * <br>
     * Finds the first bad version in the given range of versions.
     * <br>
     * This method uses a binary search to efficiently locate the first occurrence of a bad version.
     * <br>
     * Time Complexity: O(log n) due to binary search.
     * Space Complexity: O(1) as it uses constant extra space.<br>
     * <br>
     * @param n the total number of versions
     * @return the index of the first bad version, or -1 if no bad version is found
     */
    public int firstBadVersion(int n) {
        int l = 1, r = n;

        while (l < r) {
            int m = l + (r - l) / 2;
            boolean bad = isBadVersion(m);

            if (bad && !isBadVersion(m - 1)) return m;  // Check if m is the first bad version
            if (!bad) l = m + 1;  // Move to the right half if the current version is good
            else r = m;           // Move to the left half if the current version is bad
        }

        return isBadVersion(l) ? l : -1;
    }
}
