package loopy_puzzlers;

/**
 * Legal byte values range from  128 to +127, but the int constant 0x90 is equal to +144.
 * The comparison of a byte to an int is a mixed-type comparison.
 *
 * To summarize: Avoid mixed-type comparisons, because they are inher- ently confusing (Puzzle 5).
 * To help achieve this goal, use declared constants in place of “magic numbers.”
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class BigDelight {
    public static void main(String[] args) {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x90) {
                System.out.println("Joy!");
            }
        }
    }
}
