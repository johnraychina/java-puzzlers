package expressive_puzzlers;

/**
 * In other words, compound assignment expressions automatically cast the result of the computation they perform to the
 * type of the variable on their left-hand side. If the type of the result is identical to the type of the variable, the
 * cast has no effect.
 *
 * If, however, the type of the result is wider than that of the variable, the compound assignment
 * operator performs a <b>silent narrowing primitive conversion [JLS 5.1.3]</b>.
 * Attempting to perform the equivalent simple assignment would generate a compilation error, with good reason.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class Tweedledum {

    public static void main(String[] args) {

        int x = 1;
        int i = Integer.MAX_VALUE;
        x += i; //silent overflow

        System.out.println(x);
    }
}
