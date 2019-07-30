package loopy_puzzlers;

/**
 * In summary, it is possible to represent infinity as a double or a float. Most people find this somewhat surprising
 * the
 * first time they hear of it, perhaps because you can’t represent infinity by using any of the integral types. Second,
 * adding a small floating-point value to a large one will not change the large value. This too may be
 * counterintuitive,
 * as it isn’t true for the real numbers. It is worth remembering that binary floating-point arithmetic is only an
 * approximation to real arithmetic.
 *
 * Floating-point operations return the floating-point value that is closest to their exact mathematical result. Once
 * the distance between adjacent floating-point val- ues is greater than 2, adding 1 to a floating-point value will
 * have
 * no effect, because the half-way point between values won’t be reached.
 *
 * For the float type, the least magnitude beyond
 * which adding 1 will have no effect is 2<sup>25</sup>, or 33,554,432; for the
 * double type, it is 254, or approximately 1.8 × 1016.
 *
 * @author 张义 johnraychina@163.com
 */
public class Infinite {
    public static void main(String[] args) {
        double i = 1.0e50;
        double i2 = Double.POSITIVE_INFINITY;

        System.out.println("i:" + i + ", i2:" + i2);

        System.out.println(i == (i + 1));
        System.out.println(i2 == (i2 + 1));

    }
}
