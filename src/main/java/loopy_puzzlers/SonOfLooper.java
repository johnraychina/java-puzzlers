package loopy_puzzlers;

/**
 * In summary, operator overloading can be very misleading. The plus sign in the puzzle looks like addition, but it is
 * made to perform string concatenation by choosing the correct type for the variable i, which is String. The puzzle is
 * made even more misleading because the variable is named i, a name that is usually reserved for integer variables.
 * Good variable, method, and class names are at least as important to program readability as good comments.
 *
 * @author 张义 johnraychina@163.com
 */
public class SonOfLooper {
    public static void main(String[] args) {

        String i = "oh, no!";

        while (i != i + 0) {
        }
    }
}
