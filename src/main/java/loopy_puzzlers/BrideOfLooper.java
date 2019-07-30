package loopy_puzzlers;

/**
 * Right, but IEEE 754 floating-point arithmetic reserves a special value to rep- resent a quantity that is not a
 * number
 * [IEEE-754]. This value, known as NaN (short for “Not a Number”), is the value of all floating-point computations
 * that
 * do not have well-defined numeric values, such as 0.0 / 0.0. The specification says that NaN is not equal to any
 * floating-point value, including itself [JLS 15.21.1]. Therefore, if i is initialized to NaN before the loop starts,
 * the termination test (i != i) evaluates to true, and the loop never terminates. Strange but true.
 * The principle underlying the rules for computing with NaN is that once it generates NaN, a computation is damaged,
 * and no further computation can repair the damage. The NaN value is intended to allow a damaged computation to proceed
 * to a point where it is convenient to deal with the situation.
 *
 * @author 张义 johnraychina@163.com
 */
public class BrideOfLooper {

    public static void main(String[] args) {
        //Provide a declaration for i that turns this loop into an infinite loop:
        double i = 0.0 / 0.0;

        while (i != i) {
        }
    }
}
