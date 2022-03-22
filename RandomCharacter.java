import java.util.Random;

public final class RandomCharacter {
    private static final Random r = new Random();
    private static final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String primes = "2357";

    public static char getRandomLowerCaseLetter(){
        return (char)(r.nextInt(26)+97);
    }

    public static char getRandomUpperCaseLetter(){
        return (char)(r.nextInt(26)+65);
    }

    public static char getRandomDigitCharacter(){
        return (char)(r.nextInt(10)+48);
    }

    public static char getRandomCharacter(){
        return (char)(set.charAt(r.nextInt(set.length())));
    }

    public static char getPrimeChracter() {
        return (char)(primes.charAt(r.nextInt(primes.length())));
    }
}