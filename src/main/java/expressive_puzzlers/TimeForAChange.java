package expressive_puzzlers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * <pre>
 * Consider the following word problem:
 * Tom goes to the auto parts store to buy a spark plug that costs $1.10, but all he has in his wallet are two-dollar
 * bills. How much change should he get if he pays for the spark plug with a two-dollar bill?
 * </pre>
 *
 * <pre>
 *     In summary, avoid float and double where exact answers are required; for monetary calculations, use int, long,
 *     or BigDecimal. For language design- ers, consider providing linguistic support for decimal arithmetic. One
 *     approach is to offer limited support for operator overloading, so that arithmetic operators can be made to
 *     work with numerical reference types, such as BigDecimal. Another approach is to provide a primitive decimal
 *     type, as did COBOL and PL/I.
 * </pre>
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class TimeForAChange {

    public static void main(String args[]) {

        System.out.println(2.00 - 1.10);
        solution1_bigdecimal();
        solution2_normalize();

    }

    private static void solution2_normalize() {
        int a_cents = 200;
        int b_cents = 110;
        System.out.println("cents:" + (a_cents - b_cents));
    }

    private static void solution1_bigdecimal() {
        //solution 1: rounding
        //
        BigDecimal a = new BigDecimal("2.00");
        BigDecimal b = new BigDecimal("1.10");
        System.out.println("BigDecimal:" + a.subtract(b));
    }

    /**
     * Always use the BigDecimal(String) constructor, never BigDecimal(double). The latter constructor creates an
     * instance with the exact value of its argument: new BigDecimal(.1) returns a BigDecimal representing
     * 0.1000000000000000055511151231257827021181583404541015625.
     */
    private static void bad_solution() {
        //solution 1: rounding
        //
        BigDecimal a = new BigDecimal(2.00);
        BigDecimal b = new BigDecimal(1.10);
        System.out.println(a.subtract(b).round(new MathContext(2, RoundingMode.HALF_DOWN)));
    }

}
