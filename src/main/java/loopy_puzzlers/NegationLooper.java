package loopy_puzzlers;

/**
 * In summary, Java uses two’s-complement arithmetic, which is asymmetric. The signed integral types (int, long, byte,
 * and short) each have one more nega- tive value than positive, which is always the minimum value representable in the
 * type. Negating Integer.MIN_VALUE doesn’t change its value, and the same holds true for Long.MIN_VALUE. Negating
 * Short.MIN_VALUE and casting the resulting int value back to a short returns the original value (Short.MIN_VALUE). A
 * simi- lar result holds for Byte.MIN_VALUE. More generally, watch out for overflow: Like the Wolfman, it’s a killer.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class NegationLooper {

    public static void main(String[] args) {

        //int i = Integer.MIN_VALUE;
        long i = Long.MIN_VALUE;

        while (i == -i && i != 0) {
        }
    }
}
