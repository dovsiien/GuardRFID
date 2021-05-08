import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void oneWordPalindrome() {
        assertTrue(Main.isPalindrome("Anna"));
        assertTrue(Main.isPalindrome("Civic"));
        assertTrue(Main.isPalindrome("Kayak"));
        assertTrue(Main.isPalindrome("Level"));
        assertTrue(Main.isPalindrome("Madam"));
        assertTrue(Main.isPalindrome("Mom"));
        assertTrue(Main.isPalindrome("Noon"));
        assertTrue(Main.isPalindrome("Repaper"));
        assertTrue(Main.isPalindrome("Radar"));
        assertTrue(Main.isPalindrome("Tenet"));
    }

    @Test
    void oneWordNoPalindrome() {
        assertFalse(Main.isPalindrome("scarecrow"));
        assertFalse(Main.isPalindrome("bashful"));
        assertFalse(Main.isPalindrome("regular"));
        assertFalse(Main.isPalindrome("four"));
        assertFalse(Main.isPalindrome("trot"));
        assertFalse(Main.isPalindrome("nimble"));
        assertFalse(Main.isPalindrome("listen"));
        assertFalse(Main.isPalindrome("accurate"));
        assertFalse(Main.isPalindrome("motionless"));
        assertFalse(Main.isPalindrome("impulse"));
    }

    @Test
    void someWordsPalindrome() {
        assertTrue(Main.isPalindrome("Don't nod."));
        assertTrue(Main.isPalindrome("I did, did I?"));
        assertTrue(Main.isPalindrome("My gym"));
        assertTrue(Main.isPalindrome("Red rum, sir, is murder"));
        assertTrue(Main.isPalindrome("Step on no pets"));
        assertTrue(Main.isPalindrome("Top spot"));
        assertTrue(Main.isPalindrome("Was it a cat I saw?"));
        assertTrue(Main.isPalindrome("Eva, can I see bees in a cave?"));
        assertTrue(Main.isPalindrome("No lemon, no melon"));
    }

    @Test
    void someWordsNoPalindrome() {
        assertFalse(Main.isPalindrome("I am never at home on Sundays."));
        assertFalse(Main.isPalindrome("The book is in front of the table."));
        assertFalse(Main.isPalindrome("Plans for this weekend include turning wine into water."));
        assertFalse(Main.isPalindrome("He swore he just saw his sushi move."));
        assertFalse(Main.isPalindrome("Their argument could be heard across the parking lot."));
        assertFalse(Main.isPalindrome("Nudist colonies shun fig-leaf couture."));
        assertFalse(Main.isPalindrome("He dreamed of eating green apples with worms."));
        assertFalse(Main.isPalindrome("Garlic ice-cream was her favorite."));
        assertFalse(Main.isPalindrome("I often see the time 11:11 or 12:34 on clocks."));
    }

    @Test
    void specialCases() {
        assertTrue(Main.isPalindrome(""));
        assertTrue(Main.isPalindrome(" "));
        assertTrue(Main.isPalindrome("!"));
        assertTrue(Main.isPalindrome("   "));
        assertTrue(Main.isPalindrome("?"));
        assertTrue(Main.isPalindrome(",,"));
    }
}