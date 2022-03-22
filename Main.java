public class Main {
    public static void main(String[] args) {

        System.out.println("Random Lowercase");
        for (int i = 0; i < 15 ; i++) {
            System.out.print(RandomCharacter.getRandomLowerCaseLetter() + " ");
        }
        System.out.println("");

        System.out.println("Random Uppercase");
        for (int i = 0; i < 15 ; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter() + " ");
        }
        System.out.println("");

        System.out.println("Random Digit");
        for (int i = 0; i < 15 ; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");
        }
        System.out.println("");

        System.out.println("Random Character");
        for (int i = 0; i < 15 ; i++) {
            System.out.print(RandomCharacter.getRandomCharacter() + " ");
        }
        System.out.println("");
    }
}
