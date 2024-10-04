package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.StrongPasswordCheckerII;
import org.junit.jupiter.api.Test;

public class StrongPasswordCheckerIITest {

    private final StrongPasswordCheckerII passwordChecker = new StrongPasswordCheckerII();

    @Test
    public void testValidStrongPassword() {
        // Test case 1: Strong password that meets all requirements
        String password = "Aa1!abcd";
        assertTrue(passwordChecker.strongPasswordCheckerII(password), "Password should be considered strong");
    }

    @Test
    public void testTooShortPassword() {
        // Test case 2: Password shorter than 8 characters
        String password = "Aa1!";
        assertFalse(passwordChecker.strongPasswordCheckerII(password), "Password should be considered weak due to being too short");
    }

    @Test
    public void testMissingUpperCase() {
        // Test case 3: Missing uppercase letter
        String password = "aa1!abcd";
        assertFalse(passwordChecker.strongPasswordCheckerII(password), "Password should be considered weak due to missing an uppercase letter");
    }

    @Test
    public void testMissingLowerCase() {
        // Test case 4: Missing lowercase letter
        String password = "AA1!ABCD";
        assertFalse(passwordChecker.strongPasswordCheckerII(password), "Password should be considered weak due to missing a lowercase letter");
    }

    @Test
    public void testMissingDigit() {
        // Test case 5: Missing digit
        String password = "Aa!Abcde";
        assertFalse(passwordChecker.strongPasswordCheckerII(password), "Password should be considered weak due to missing a digit");
    }

    @Test
    public void testMissingSpecialCharacter() {
        // Test case 6: Missing special character
        String password = "Aa1Abcde";
        assertFalse(passwordChecker.strongPasswordCheckerII(password), "Password should be considered weak due to missing a special character");
    }

    @Test
    public void testConsecutiveCharacters() {
        // Test case 7: Contains consecutive identical characters
        String password = "Aa1!aabb";
        assertFalse(passwordChecker.strongPasswordCheckerII(password), "Password should be considered weak due to consecutive identical characters");
    }

    @Test
    public void testAllRequirementsMet() {
        // Test case 8: A different valid strong password
        String password = "C1#DxyZ9!";
        assertTrue(passwordChecker.strongPasswordCheckerII(password), "Password should be considered strong");
    }
}