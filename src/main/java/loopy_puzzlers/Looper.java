package loopy_puzzlers;

/**
 * The distance between adjacent floating-point values is called an ulp, which is an acronym for unit in the last place.
 * In release 5.0, the Math.ulp method was introduced to calculate the ulp of a float or double value.
 * <p>
 * In summary, it is possible to represent infinity as a double or a float. Most people find this somewhat surprising
 * the first time they hear of it, perhaps because you can’t represent infinity by using any of the integral types.
 * Second, adding a small floating-point value to a large one will not change the large value. This too may be
 * counterintuitive, as it isn’t true for the real numbers. It is worth remembering that binary floating-point
 * arithmetic is only an approximation to real arithmetic.
 *
 * @author 张义 johnraychina@163.com
 */
public class Looper {
    public static void main(String[] args) {

        int start = Integer.MAX_VALUE - 1;

        //1) i++ overflow
        //for (int i = start; i <= start + 1; i++) {
        //}

        //2) infinity + 1 is still infinity
        //double i = Double.POSITIVE_INFINITY;
        //while (i == i + 1) {
        //}

        //3)a tiny number added to a big double number will be ignored.
        double x = 1.0e20;
        x++;
        System.out.println(x);
        System.out.println(Math.ulp(x));

        //IntStream.rangeClosed(start, start + 1).forEach(System.out::println);
        //System.out.println("start+1:" + (start + 1));
        //System.out.println("start+2:" + (start + 2));
        //IntStream.rangeClosed(start, start + 2).forEach(System.out::println);

    }
}
