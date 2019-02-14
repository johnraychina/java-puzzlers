package loopy_puzzlers;

/**
 * When i gets to Integer.MAX_VALUE and is incremented,
 * it silently wraps around to Integer.MIN_VALUE.
 *
 * More generally, the lesson here is that ints are not integers.
 * Whenever you use an integral type, be aware of the
 * boundary conditions.
 *
 * What happens if the value underflows or overflows?
 * Often it is best to use a larger type. (Theintegral types are byte, char, short, int, and long.)
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class InTheLoop {

    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;

    public static void main(String[] args) {
        int count = 0;
        //for (int i = START; i <= END; i++) {
        //    if (i == END) {
        //        System.out.println("END?");
        //    }
        //    count++;
        //}

        for (long i = START; i <= END; i++) {
            if (i == END) {
                System.out.println("END!");
            }
            count++;
        }
        System.out.println(count);
    }
}
