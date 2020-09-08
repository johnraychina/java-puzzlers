package loopy_puzzlers;

/**
 * The moral of this puzzle is simple: Do not use floating-point loop indices, because it can lead to unpredictable
 * behavior. If you need a floating-point value in the body of a loop, take the int or long loop index and convert it to
 * a float or double. You may lose precision when converting an int or long to a float or a long to a double, but at
 * least it will not affect the loop itself. When you use floating-point, use double rather than float unless you are
 * certain that float provides enough precision and you have a compelling performance need to use float. The times when
 * it’s appropriate to use float rather than double are few and far between.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class Count {
    public static void main(String[] args) {
        final int START = 2000000000;
        int count = 0;

        for (float f = START; f < START + 50; f++) { count++; }

        //Fixing this program is as simple as changing the type of the loop variable from a float to an int. This
        // avoids all the imprecision associated with floating- point computation:
        for (int i = START; i < START + 50; i++) { count++; }

        System.out.println(count);

    }
}
