public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 15 ; i++) {
            System.out.print(RandomCharacter.getRandomLowerCaseLetter() + " ");
        }
        System.out.println("");

        for (int i = 0; i < 15 ; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter() + " ");
        }
        System.out.println("");

        for (int i = 0; i < 15 ; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");
        }
        System.out.println("");

        for (int i = 0; i < 15 ; i++) {
            System.out.print(RandomCharacter.getRandomCharacter() + " ");
        }
        System.out.println("");
    }
}
