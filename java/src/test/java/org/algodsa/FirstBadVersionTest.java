package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.FirstBadVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstBadVersionTest {

    private FirstBadVersion firstBadVersion;

    @BeforeEach
    public void setUp() {
        // Initialize with a known first bad version for testing
        firstBadVersion = new FirstBadVersion(4);
    }

    @Test
    public void testFirstBadVersionFoundInMiddle() {
        assertEquals(4, firstBadVersion.firstBadVersion(10));
    }

    @Test
    public void testFirstBadVersionIsFirst() {
        firstBadVersion = new FirstBadVersion(1);
        assertEquals(1, firstBadVersion.firstBadVersion(10));
    }

    @Test
    public void testFirstBadVersionIsLast() {
        firstBadVersion = new FirstBadVersion(10);
        assertEquals(10, firstBadVersion.firstBadVersion(10));
    }

    @Test
    public void testOnlyOneVersionAndItIsBad() {
        firstBadVersion = new FirstBadVersion(1);
        assertEquals(1, firstBadVersion.firstBadVersion(1));
    }

    @Test
    public void testLargeNumberOfVersions() {
        firstBadVersion = new FirstBadVersion(5000);
        assertEquals(5000, firstBadVersion.firstBadVersion(10000));
    }
}
