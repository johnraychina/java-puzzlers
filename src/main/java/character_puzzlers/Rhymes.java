package character_puzzlers;

import java.util.Random;

/**
 * To summarize: First, be careful of fencepost errors.
 * Second, remember to put a break after each case in switch statements.
 * Third, use common idioms and APIs, and consult the documentation when you stray from the well-worn path.
 * Fourth, a char is not a String but is more like an int. Finally, watch out for sneaky puzzlers.
 *
 * @author 张义 johnraychina@163.com
 */
public class Rhymes {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        bad();
        noSoBad();
        ok();
        good();
    }

    public static void bad() {
        StringBuffer word = null;
        switch (rnd.nextInt(2)) {
            case 1:
                word = new StringBuffer('P');
            case 2:
                word = new StringBuffer('G');
            default:
                word = new StringBuffer('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }

    public static void noSoBad() {
        StringBuffer word = null;
        switch (rnd.nextInt(2)) {
            case 1:
                word = new StringBuffer("P");
                break;
            case 2:
                word = new StringBuffer("G");
                break;
            default:
                word = new StringBuffer("M");
                break;
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }

    private static void ok() {
        System.out.println("PGM".charAt(rnd.nextInt(3)) + "ain");
    }

    private static void good() {
        String a[] = {"Main", "Pain", "Gain"};
        System.out.println(a[rnd.nextInt(a.length)]);
    }
}
