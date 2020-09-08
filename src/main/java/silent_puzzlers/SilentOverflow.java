package silent_puzzlers;

/**
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class SilentOverflow {
    public static void main(String[] args) {

        // no arithmetic operation other than divide by zero shall produces Exception ( ArithmeticException )
        //For int, from -2147483648 to 2147483647, inclusive
        //For long, from -9223372036854775808 to 9223372036854775807, inclusive
        int i = 100000 * 100000;
        System.out.printf("i=%d \n", i);

        // type conversion: float -> int, precision loss
        float f = 12_345_678_901F;
        int i_f = (int)f;
        System.out.printf("%f(%s) ==> %d(%s) \n", f, Float.toHexString(f), i_f, Integer.toHexString(i_f));

    }
}
