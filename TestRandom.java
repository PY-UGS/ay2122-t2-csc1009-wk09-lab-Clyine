import static org.junit.Assert.*;
import org.junit.Test;

public class TestRandom {
    private static String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static String primes = "2357";

    @Test
    public void getRandomLowerCaseLetter() {
        for (int i = 0; i < 100; i++) {
            assertTrue("Random lower case is correct", RandomCharacter.getRandomLowerCaseLetter() >= 'a'
                    && RandomCharacter.getRandomLowerCaseLetter() <= 'z');
        }
    }

    @Test
    public void getRandomUpperCaseLetter() {
        for (int i = 0; i < 100; i++) {
            assertTrue("Random Upper case is correct", RandomCharacter.getRandomUpperCaseLetter() >= 'A'
                    && RandomCharacter.getRandomUpperCaseLetter() <= 'Z');
        }
    }

    @Test
    public void getRandomDigitCharacter() {
        for (int i = 0; i < 100; i++) {
            assertTrue("Random digit case is correct", RandomCharacter.getRandomDigitCharacter() >= '0'
                    && RandomCharacter.getRandomDigitCharacter() <= '9');
        }
    }

    @Test
    public void getRandomChar() {
        for (int i = 0; i < 100; i++) {
            assertTrue("Random character case is correct",
                    set.indexOf((int) RandomCharacter.getRandomLowerCaseLetter()) >= 0);
        }
    }

    @Test
    public void isPrime() {
        for (int i = 0; i < 100; i++) {
            assertTrue("Random digit is Prime", primes.indexOf((int) RandomCharacter.getPrimeChracter()) >= 0);
        }
    }

}
