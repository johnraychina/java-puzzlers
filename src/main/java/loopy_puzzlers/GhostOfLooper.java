package loopy_puzzlers;

/**
 * The first step in the execution of the shift operation is that the value of i is promoted to an int. All arithmetic
 * operations do this to operands of type short, byte, or char.
 *
 * In order to store the int value into the short variable, Java performs the dreaded narrowing primitive conversion,
 * which simply lops off the high-order 16 bits of the value. This leaves (short)0xffff, and we are back where we
 * started. The second and successive iterations of the loop behave identically, so the loop never terminates.
 *
 * In summary, do not use compound assignment operators on short, byte, or char variables. Such expressions perform
 * mixed-type arithmetic, which can be confusing in and of itself. Far worse, they perform an implicit narrowing cast,
 * which can discard information. The results can be disastrous.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class GhostOfLooper {
    public static void main(String[] args) {
        //Provide a declaration for i that turns this loop into an infinite loop:
        byte i = -1;
        while (i != 0) { i >>>= 1; }
    }
}
