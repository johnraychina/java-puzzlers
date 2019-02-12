package expressive_puzzlers;

/**
 * This puzzle is called Long Division because it concerns a program that divides two long values. The dividend
 * represents the number of microseconds in a day; the divisor, the number of milliseconds in a day. What does the
 * program print?
 *
 *
 * The lesson is simple: When working with large numbers, watch out for overflow—it’s a silent killer.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class LongDivision {

    public static void main(String[] args) {

        //Integer.MAX_VALUE: 2<sup>31</sup>-1.
        //Long.MAX_VALUE: 2<sup>63</sup>-1.

        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MICROS_PER_DAY2 = 24 * 60 * 60 * 1000 * 1000L;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        //System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        System.out.println(MICROS_PER_DAY);
        System.out.println(MICROS_PER_DAY2);
        System.out.println(MICROS_PER_DAY2 / MILLIS_PER_DAY);
    }
}
