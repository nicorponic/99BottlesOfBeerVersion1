package pkg99bottles;

/**
 *
 * @author N1CO
 */
public class Main {

    public static void main(String[] args) {

        for (int x = 99; x >= 0; x--) {
            if (x == 1) {
                singFirstVerse(x);
                System.out.println("No more bottles of beer on the wall");
                System.out.println();

            } else if (x == 0) {
                System.out.println("Better go to the store and buy some more.");
            } else {
                singFirstVerse(x);
                System.out.println((x - 1) + " bottles of beer");
                System.out.println();
            }

        }

    }

    static void singFirstVerse(int a) {

        System.out.println(a + " bottle of beer on the wall");
        System.out.println(a + " bottle of beer");
        System.out.println("Take one down, pass it around");

    }
}
