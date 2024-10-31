package main.java.org.algodsa;

/**
 * This abstract class serves as a base for version control systems that track bad versions.
 * It provides a method to check if a specific version is bad.
 */
public abstract class VersionControl {
    private final int firstBadVersion;

    /**
     * Constructor to set the first bad version.
     *
     * @param firstBadVersion the first bad version in the sequence
     */
    public VersionControl(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
    }

    /**
     * Checks if a given version is bad.
     * <br>
     * @param version the version number to check
     * @return true if the version is bad; false otherwise
     */
    protected boolean isBadVersion(int version) {
        return version >= firstBadVersion;
    }
}
