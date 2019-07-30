package expressive_puzzlers;

/**
 * <pre>
 * The Java’s remainder operator (%)is defined to satisfy the following identity
 * for all int values a and all nonzero int values b:
 *    (a / b) * b + (a % b) == a
 *
 * when the remainder operation returns a nonzero result,
 * it has the same sign as its left operand.
 *
 * </pre>
 *
 * @author 张义 johnraychina@163.com
 */
public class Oddity {

    public static boolean isOdd_bad(int i) {
        return i % 2 == 1;
    }

    public static boolean isOdd_ok(int i) {
        return i % 2 != 0;
    }

    /**
     * It’s a bad idea to optimize prematurely, but in this case,
     * the faster version is as clear as the original,
     * so there is no reason to pre- fer the original.
     * @param i
     * @return
     */
    public static boolean isOdd_super_fast(int i) {
        return (i & 1) != 0;
    }


    public static void main(String[] args) {

        int total = 3;
        int result = total / 2;
        int remainder = total % 2;
        System.out.printf("%s / 2 => (%s, %s) \n", total, result, remainder);

        total = -3;
        result = total / 2;
        remainder = total % 2;
        System.out.printf("%s / 2 => (%s, %s) \n", total, result, remainder);
    }
}
