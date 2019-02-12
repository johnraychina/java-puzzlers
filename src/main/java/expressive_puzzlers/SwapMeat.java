package expressive_puzzlers;

/**
 * This program uses the compound assignment operator for exclusive OR. The tech- nique that it illustrates is part
 * of the programming folklore. What does it print?
 *
 * The lesson is simple: Do not assign to the same variable more than once in a single expression. Expressions
 * containing multiple assignments to the same variable are confusing and seldom do what you want. Even expressions that
 * assign to multiple variables are suspect. More generally, avoid clever programming tricks. They are bug-prone,
 * difficult to maintain, and often run more slowly than the straightforward code they replace [EJ Item 37].
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class SwapMeat {

    public static void main(String[] args) {

        cleverSwap();
    }

    private static void cleverSwap() {
        int x = 1984;  // (0x7c0)
        int y = 2001;  // (0x7d1)


        /*Swaps variables without a temporary - Don’t do this!
         * x = x ^ y;
         * y = y ^ x;
         * x = y ^ x;
         */
        x ^= y ^= x ^= y;

        System.out.println("x = " + x + "; y = " + y);

        //solution:
        //The obvious way to swap two variables is to use a temporary variable:
        x = 1984;  // (0x7c0)
        y = 2001;  // (0x7d1)
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x = " + x + "; y = " + y);
    }

}
